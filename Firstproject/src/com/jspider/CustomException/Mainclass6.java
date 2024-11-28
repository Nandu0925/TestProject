package com.jspider.CustomException;

public class Mainclass6 {
	public static void main(String[] args) {
		System.out.println("progarm starts");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			String s=e.getMessage();
			System.out.println(s);
			
			e.printStackTrace();
		}
		System.out.println("Program ends");
	}

}
