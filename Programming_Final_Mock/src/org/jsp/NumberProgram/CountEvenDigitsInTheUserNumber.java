package org.jsp.NumberProgram;

import java.util.Scanner;

public class CountEvenDigitsInTheUserNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		int count=0;
		while(a>0) {
			int rem=a%10;
			if(rem%2==0) {
				count++;
			}
			a=a/10;
			
		}
		System.out.println(count);
	}

}
