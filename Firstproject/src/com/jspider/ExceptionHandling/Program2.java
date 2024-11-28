package com.jspider.ExceptionHandling;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("progarm starts");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}
		System.out.println("program ends");
	}

}
