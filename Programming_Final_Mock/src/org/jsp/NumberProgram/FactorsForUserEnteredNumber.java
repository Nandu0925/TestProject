package org.jsp.NumberProgram;

import java.util.Scanner;

public class FactorsForUserEnteredNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
			System.out.println(i);
		}
	}

}
