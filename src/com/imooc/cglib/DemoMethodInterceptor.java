package com.imooc.cglib;

import java.lang.reflect.Method;

import org.logicalcobwebs.cglib.proxy.MethodInterceptor;
import org.logicalcobwebs.cglib.proxy.MethodProxy;

public class DemoMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("before in cglib");
		Object result = null;
		try{
			result = proxy.invokeSuper(obj, args);
		} catch(Exception e){
			System.out.println("get ex:" + e.getMessage());
			throw e;
		} finally {
			System.out.println("after in cglib");
		}
		return result;
	}

}
