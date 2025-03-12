package org.jsp.NumberProgram;

import java.util.Scanner;

public class NeonNumbercheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		if(isNeon(n)) {
			System.out.println("Neon");
		}else {
			System.out.println("not a neon");
		}
	}
	public static boolean isNeon(int n) {
		int sum=0;
		int square=n*n;
		while(square>0) {
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		return sum==n;
		
	}

}
