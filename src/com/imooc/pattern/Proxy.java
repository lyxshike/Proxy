package com.imooc.pattern;

public class Proxy implements Subject {

	private RealSubject realSubject;
	
	public Proxy(RealSubject realSubject){
		this.realSubject = realSubject;
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("before");
		try{
			realSubject.request();
		} catch (Exception e){
			System.out.println("ex" + e.getMessage());
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			System.out.println("after");
		}
	}

}
