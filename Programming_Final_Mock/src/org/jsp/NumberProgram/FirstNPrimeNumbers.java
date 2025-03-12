package org.jsp.NumberProgram;

import java.util.Scanner;

public class FirstNPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int a=2;
		int count=0;
		while(true) {
			if(isPrime(a)) {
				
				count++;
			}
			
			if(count==n) {
				System.out.println(a);
				break;
			}
			a++;
		}
	}

	private static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
