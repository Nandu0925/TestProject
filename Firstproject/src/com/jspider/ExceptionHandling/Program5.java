package com.jspider.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		try {
			int val=sc.nextInt();
			System.out.println("value:"+val);
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input");
		}
		finally {
			sc.close();
			System.out.println("scanner closed");
		}
		
	}

}
