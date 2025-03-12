package org.jsp.TWODArray;

public class Transpose {
	public static void main(String[] args) {
		int a[][]= {{10,20,40},{40,50,60},{70,80,90}};
		int b[][]=new int[a.length][a.length];
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<=b.length-1;i++) {
			for(int j=0;j<=b.length-1;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
