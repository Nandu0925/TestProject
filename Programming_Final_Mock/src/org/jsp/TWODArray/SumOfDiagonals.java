package org.jsp.TWODArray;

public class SumOfDiagonals {
	public static void main(String[] args) {
		int a[][]= {{10,20,30},{20,30,40},{30,40,50}};
		int psum=0;
		int ssum=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(i+j==a.length-1) {
					psum=psum+a[i][j];
				}
				if(i==j) {
					ssum=ssum+a[i][j];
				}
				
			}
			
		}
		System.out.println(psum);
		System.out.println(ssum);
	}

}
