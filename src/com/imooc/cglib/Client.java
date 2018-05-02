package com.imooc.cglib;

import org.logicalcobwebs.cglib.proxy.Enhancer;

import com.imooc.pattern.RealSubject;
import com.imooc.pattern.Subject;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(RealSubject.class);
		enhancer.setCallback(new DemoMethodInterceptor());
		Subject subject = (Subject)enhancer.create();
		subject.request();
	}

}
