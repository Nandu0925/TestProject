package com.jspider.Number;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		if(isAuto(n))
			System.out.println("automarphic");
		else
			System.out.println("not a automarphic:");
	}
	public static boolean isAuto(int n) {
		int sq=n*n;
		while(n>0) {
			int rem1=n%10;
			int rem2=sq%10;
			
			if(rem1!=rem2) {
				return false;
			}
			n=n/10;
			sq=sq/10;
		}
		return true;
	}

}
