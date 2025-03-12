package org.jsp.NumberProgram;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		int count=0;
		while(a>0) {
			int rem=a%10;
			//System.out.println(rem);
			count++;
			a=a/10;
		}
		System.out.println(count);
	}

}
