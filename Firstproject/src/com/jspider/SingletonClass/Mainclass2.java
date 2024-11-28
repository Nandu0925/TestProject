package com.jspider.SingletonClass;

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r1=Resource.getResource();
		Resource r2=Resource.getResource();
		Resource r3=Resource.getResource();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		

	}

}
