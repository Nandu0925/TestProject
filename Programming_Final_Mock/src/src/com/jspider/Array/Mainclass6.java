package com.jspider.Array;

import java.util.Scanner;

public class Mainclass6 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        System.out.println("Prime numbers in the array are:");
	        for (int i=0;i<array.length;i++) {
	        	int num=array[i];
	            if (isPrime(num)) {
	                System.out.print(num + " ");
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

