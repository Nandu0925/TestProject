package com.jspider.Pattren;

public class Mainclass21 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int l=1;
			for(int j=1;j<=n-i;j++) {
				System.out.print("");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k%2!=0) {
				System.out.print(" "+l);
				l++;
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			int l=1;
			for(int j=1;j<=n-i;j++) {
				System.out.print("");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k%2!=0) {
				System.out.print(" "+l);
				l++;
				}
			}
			System.out.println();
		}
	}
}
