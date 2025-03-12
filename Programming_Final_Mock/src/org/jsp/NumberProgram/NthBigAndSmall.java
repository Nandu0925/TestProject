package org.jsp.NumberProgram;

import java.util.Arrays;
import java.util.HashSet;

public class NthBigAndSmall {
	public static void main(String[] args) {
		int a[]= {4,6,1,8,10,9,9,8};
		int n=2;
		
		System.out.println("after removing duplicates ele");
		int b[]=removeDuplicateEle(a);
		System.out.println(Arrays.toString(b));
		
		System.out.println(b[b.length-n]);
		System.out.println(b[n-1]);
	}

	private static int[] removeDuplicateEle(int[] a) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<=a.length-1;i++) {
			hs.add(a[i]);
		}
		int b[]=new int[hs.size()];
		int in=0;
		
		for(int ele:hs) {
			b[in]=ele;
			in++;
		}
		return b;
	}
	

}
