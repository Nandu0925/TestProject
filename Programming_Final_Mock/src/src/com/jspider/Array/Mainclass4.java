package com.jspider.Array;

import java.util.Scanner;

public class Mainclass4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values:");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int small=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(small);
	}

}
