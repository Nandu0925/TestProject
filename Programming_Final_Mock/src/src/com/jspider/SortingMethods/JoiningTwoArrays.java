package com.jspider.SortingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class JoiningTwoArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size1 of the array: ");
        int size1 = scanner.nextInt();
        int[] a = new int[size1];
        System.out.println("Enter " + size1 + " elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("enter the size2 of second array:");
        int size2 = scanner.nextInt();
        int[] b = new int[size2];
        System.out.println("Enter " + size2 + " elements:");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        
        int d[]=merge(a,b);
        System.out.println(Arrays.toString(d)); 
        
        
	}
	static int[] merge(int a[],int b[] ){
		int c[]=new int[a.length+b.length];
		 for(int i=0;i<a.length;i++) {
	        	c[i]=a[i];
	        }
		 for(int i=0;i<b.length;i++) {
			 c[a.length+i]=b[i];
		 }
		 return c;
		
	}

}
