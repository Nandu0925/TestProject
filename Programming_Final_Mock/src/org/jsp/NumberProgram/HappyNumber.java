package org.jsp.NumberProgram;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		if(isHappy(n)) {
			System.out.println("happy number");
		}
		else {
			System.out.println("not a happy number");
		}
	}

	private static boolean isHappy(int n) {
		while(n>9) {
			int sum=0;
			while(n>0) {
				int rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
			}
			n=sum;
		}
		if(n==1||n==7) {
			return true;
		}else {
			return false;
		}
		
	}

}
