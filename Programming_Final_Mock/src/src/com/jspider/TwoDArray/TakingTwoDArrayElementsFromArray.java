package com.jspider.TwoDArray;

import java.util.Scanner;

public class TakingTwoDArrayElementsFromArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nor rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the nor cols:");
		int cols=sc.nextInt();
		
		int a[][]=new int[rows][cols];
		
		System.out.println("enter "+(rows*cols)+" elements");
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("=============================");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
