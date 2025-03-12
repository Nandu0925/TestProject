package com.jspider.Array;

import java.util.Arrays;

public class PushLeastNumberToLast {
	public static void main(String[] args) {
		int a[]= {20,0,10,0,30,0};
		int in=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=0) {
				a[in]=a[i];
				in++;
			}
		}
		for(int i=in;i<=a.length-1;i++) {
			a[in]=0;
			in++;
		}
		System.out.println(Arrays.toString(a));
	}

}
