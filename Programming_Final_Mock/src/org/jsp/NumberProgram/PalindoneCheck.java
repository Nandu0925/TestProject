package org.jsp.NumberProgram;

import java.util.Scanner;

public class PalindoneCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		//int r=isPalindrone(n);
		if(isPalindrone(n)) {
			System.out.println("palindrone");
		}else {
			System.out.println("not a palindrone");
		}
	}

	private static boolean isPalindrone(int n) {
		int com=n;
		int org=0;
		while(n>0) {
			int rem=n%10;
			org=10*org+rem;
			n=n/10;
		}
		return org==com;
		
	}

}
