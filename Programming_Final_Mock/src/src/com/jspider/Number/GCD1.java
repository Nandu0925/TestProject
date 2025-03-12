package com.jspider.Number;

public class GCD1 {
	public static int gcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
		
	}
	public static void main(String[] args) {
		int a=gcd(36,12);
		System.out.println(a);
		
	}

}
