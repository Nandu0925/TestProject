package org.jsp.NumberProgram;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		if(isSpy(a)) {
			System.out.println("spy number");
		}else {
			System.out.println("not a spy number");
		}
		
	}
	public static boolean isSpy(int a) {
		int sum=0;
		int psum=1;
		while(a>0) {
			int rem=a%10;
			sum=sum+rem;
			psum=psum*rem;
			a=a/10;
		}
		return sum==psum;
	}
}
