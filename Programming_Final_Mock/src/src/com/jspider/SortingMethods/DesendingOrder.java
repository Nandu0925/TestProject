package com.jspider.SortingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class DesendingOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int k = 0; k < a.length; k++) {
            a[k] = scanner.nextInt();
        }
     
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
	
	}
		System.out.println(Arrays.toString(a));
		System.out.println("After sorting:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
	

	}
	}

}
