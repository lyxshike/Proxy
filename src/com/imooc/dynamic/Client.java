package com.imooc.dynamic;

import java.lang.reflect.Proxy;

import com.imooc.pattern.RealSubject;
import com.imooc.pattern.Subject;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Subject.class}, new JdkProxySubject(new RealSubject()));
	    subject.request();
	}

}
