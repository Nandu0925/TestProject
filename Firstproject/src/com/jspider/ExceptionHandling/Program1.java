package com.jspider.ExceptionHandling;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("program starts");
		String str="Developer";
		try {
			System.out.println(str.charAt(7));
		}
		catch(NullPointerException e) {
			System.out.println("access with null reference");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("invalid index access");
		}
		System.out.println("program ends");
	}

}
