package com.jspider.Narrowing;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=4.5f;
		int b=(int)a;//Narrowing : float--->int
		System.out.println(b);
		
		int x=97;
		char y=(char)x;//Narrowing : int---->char
		System.out.println(y);
		
		long p=34567l;
		int q=(int)p;//Narrowing : long---->int
		System.out.println(q);

	}

}
