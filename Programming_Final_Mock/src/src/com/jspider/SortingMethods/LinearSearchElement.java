package com.jspider.SortingMethods;

import java.util.Scanner;

public class LinearSearchElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        int b=scanner.nextInt();
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<=a.length;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==b) {
        			System.out.println(a[i]-1);
        		}
        	}
        }
	}

}
