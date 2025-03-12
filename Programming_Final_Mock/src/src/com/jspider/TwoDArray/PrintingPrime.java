package com.jspider.TwoDArray;

public class PrintingPrime {
	public static void main(String[] args) {
		int a[][]= {{3,2,3,7},{4,5,6},{7,8,9}};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				//System.out.print(a[i][j]+" ");
				if (isPrime(a[i][j])) {
	                System.out.print(a[i][j]+" ");
			}
		}
			System.out.println();
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

