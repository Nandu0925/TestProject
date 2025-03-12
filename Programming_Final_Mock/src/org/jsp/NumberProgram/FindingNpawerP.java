package org.jsp.NumberProgram;

import java.util.Scanner;

public class FindingNpawerP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n: ");
		int n=sc.nextInt();
		System.out.println("enter the number p: ");
		int p=sc.nextInt();
		int result=isNP(n,p);
		System.out.println(result);
	}

	private static int isNP(int n, int p) {
		int total=1;
		for(int i=1;i<=p;i++) {
			total=total*n;
		}
		return total;
		
	}

}
