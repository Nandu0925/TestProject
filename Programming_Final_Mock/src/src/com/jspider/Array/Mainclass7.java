package com.jspider.Array;

import java.util.Scanner;

public class Mainclass7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Palindrons in the array are :");
        int count=0;
        for (int i=0;i<array.length;i++) {
            if (isPall(array[i])) {
                count++;
            }
        }
        System.out.println(count);
	}
        static boolean isPall(int n) {
        	int rev=0;
        	int temp=n;
        	while(n>0) {
        		int rem=n%10;
        		rev=rev*10+rem;
        		n=n/10;
        	}
        	return rev==temp;
        }

}
