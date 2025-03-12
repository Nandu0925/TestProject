package com.jspider.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Mainclass12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("creating boolean array:");
        boolean b[]=new boolean[array.length];
        System.out.println("Frequency in the array are :");
        for (int i=0;i<=array.length-1;i++) {
        	if(b[i]==false) {
        		int count=1;
        		for(int j=i+1;j<=array.length-1;j++) {
        			if(array[i]==array[j]) {
        				count++;
        				b[j]=true;
        			}
        		}
        		if(count>1)
        		System.out.println(array[i]+"frequency is:"+count);
        	}
        	 
	}
	
	}
	

}
