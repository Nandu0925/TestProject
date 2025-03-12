package org.jsp.NumberProgram;

import java.util.Scanner;

public class SumOntilSingleDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int result=isSingleDigit(n);
		System.out.println(result);
	}

	private static int isSingleDigit(int n) {
		while(n>9) {
			int sum=0;
			while(n>0) {
				int rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			n=sum;
		}
		
		return n;
		
	}

	

}
