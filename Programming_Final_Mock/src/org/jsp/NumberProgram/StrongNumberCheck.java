package org.jsp.NumberProgram;

import java.util.Scanner;

public class StrongNumberCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:  ");
		int n=sc.nextInt();
		if(isStrong(n)) {
			System.out.println("strong number");
		}else {
			System.out.println("not a strong number");
		}
	}

	private static boolean isStrong(int n) {
		int sum=0;
		int org=n;
		int full=0;
		while(n>0) {
			int rem=n%10;
			
			int fact=factorial(rem);
			full=full+fact;
			n=n/10;
			
		}
		if(full==org) {
			return true;
			
		}else {
			return false;
		}
		
	}

	private static int factorial(int sum) {
		int fact=1;
		for(int i=sum;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}
