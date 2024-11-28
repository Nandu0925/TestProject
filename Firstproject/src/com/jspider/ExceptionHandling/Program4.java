package com.jspider.ExceptionHandling;

public class Program4 {
	public static void main(String[] args) {
		try {
			System.out.println("try starts");
			System.out.println(10/0);
			System.out.println("try ends");
		}
		catch(ArithmeticException e) {
			System.out.println("/by zero");
		}
		finally {
			System.out.println("exicuting finally block");
		}
	}

}
