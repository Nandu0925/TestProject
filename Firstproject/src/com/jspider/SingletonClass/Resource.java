package com.jspider.SingletonClass;

public class Resource {
	private static Resource r=new Resource();//enthuziastic initialization
	public static Resource getResource() {
		if(r==null) {
			r=new Resource();
		}
		return r;
	}
	private Resource() {
		
	}

}
