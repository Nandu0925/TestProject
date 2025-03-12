package com.jspider.Array;

public class Mainclass14 {
	public static void main(String[] args) {
		int a[]= {5,1,7,3};
        int big=a[0];
        int small=a[0];
        for(int i=1;i<=a.length-1;i++) {
        	if(a[i]>big) {
        		big=a[i];
        	}
        	if(a[i]<small) {
        		small=a[i];
        	}
        }
        for(int i=small+1;i<=big-1;i++) {
        	boolean res=isMissing(i,a);
        	if(res==true) {
        		System.out.println(i);
        	}
        }
        
	
	}
	static boolean isMissing(int n,int a[]) {
		for(int i=0;i<=a.length-1;i++) {
			if(n==a[i]) {
				return false;
			}
			
		}
		return true;
	}
	
	

}
