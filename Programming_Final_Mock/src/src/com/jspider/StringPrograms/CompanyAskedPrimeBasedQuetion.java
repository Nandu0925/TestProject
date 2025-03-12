package com.jspider.StringPrograms;

public class CompanyAskedPrimeBasedQuetion {
	public static void main(String[] args) {
		for (int i=10;i<=20;i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) 
        	return false; 
        for (int i = 2; i <=n/2; i++) {
            if (n % i == 0) 
            	return false; 
        }
        return true;
}
	}

