package com.jspider.Array;

public class Mainclass1 {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=4;
		a[1]=2;
		a[2]=6;
		a[3]=3;
		a[4]=9;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
