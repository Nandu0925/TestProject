package org.jsp.NumberProgram;

import java.util.Scanner;

public class PrimeNumbersBetween {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static boolean isPrime(int n) {
		int count=1;
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
