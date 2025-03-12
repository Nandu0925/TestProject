package com.jspider.Number;

public class GCD {
	public static void main(String[] args) {
		int n=12;
		int m=36;
		int gcd=1;
		for(int i=1;i<=n&&i<=m;i++) {
			if(n%i==0&&m%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
