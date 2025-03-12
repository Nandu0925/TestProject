package com.jspider.Test;

public class Mainclass1 {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		int c=40;
		int d=30;
		int e=25;
		int big=(a>b&&a>c&&a>d&&a>e)?a:(b>c&&b>d&&b>e)?b:(c>d&&d>e)?c:(d>e)?d:e;
		System.out.println(big);
	}

}
