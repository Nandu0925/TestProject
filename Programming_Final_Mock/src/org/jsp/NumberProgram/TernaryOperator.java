package org.jsp.NumberProgram;

public class TernaryOperator {
	public static void main(String[] args) {
		int a=1;
		int b=20;
		int c=5;
		int d=15;
		int small=(a<b&&a<c&&a<d)?a:(b<c&&b<d)?b:(c<d)?c:d;
		System.out.println(small);
	}

}
