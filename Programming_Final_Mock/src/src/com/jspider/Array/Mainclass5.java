package com.jspider.Array;

import java.util.Scanner;

public class Mainclass5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the index values:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			}
		System.out.println(sum);
		}
	}

