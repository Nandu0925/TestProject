package org.jsp.NumberProgram;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("it is prime number");
		}else {
			System.out.println("it is not prime number");
		}
	}

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
		
		
	}

}
