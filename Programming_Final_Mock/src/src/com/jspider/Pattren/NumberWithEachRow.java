package com.jspider.Pattren;

public class NumberWithEachRow {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
