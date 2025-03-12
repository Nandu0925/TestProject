package com.jspider.SortingMethods;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("creating integer array:");
        int b[]=new int[a.length];
        for (int i=a.length-1;i>=0;i--) {
        	if(b[i]==0) {
        		b[i]=a[i];
        		
        		System.out.println(b[i]);
        	}

	}

}
}
