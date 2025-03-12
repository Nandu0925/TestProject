package com.jspider.TwoDArray;

public class SumOfDiaganals {
	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int Psum=0;
		int Ssum=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(i+j==a.length-1) {
					Psum=a[i][j]+Psum;
				}
				if(i==j) {
					Ssum=a[i][j]+Ssum;
				}
			}
		}
		System.out.println("Primary diaganal sum:"+Psum);
		System.out.println("Secondary diaganal sum:"+Ssum);
	}

}
