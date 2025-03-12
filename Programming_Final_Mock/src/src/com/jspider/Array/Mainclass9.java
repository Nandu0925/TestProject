package com.jspider.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Mainclass9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Replace in the array are :");
        for (int i=0;i<array.length;i++) {
            array[i]=sumOfDigit(array[i]);
        }
        System.out.println(Arrays.toString(array));
        
	}
	static int sumOfDigit(int n) {
		int sum=0;
    	while(n>0) {
    		int rem=n%10;
    		sum=sum+rem;
    		n=n/10;
    	}
    	return sum;
	}

}
