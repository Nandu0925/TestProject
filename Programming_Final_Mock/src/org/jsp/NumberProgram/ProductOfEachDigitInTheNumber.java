package org.jsp.NumberProgram;

import java.util.Scanner;

public class ProductOfEachDigitInTheNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		int psum=1;
		while(a>0) {
			int rem=a%10;
			psum=psum*rem;
			a=a/10;
			
		}
		System.out.println(psum);
	}

}
