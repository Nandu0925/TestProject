package com.jspider.StringPrograms;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s="ram is good";
		String arr[]=s.split(" ");
		String rev="";
		for(int i=0;i<=arr.length-1;i++) {
			String r=reverse(arr[i]);
			rev=rev+r+" ";
		}
		System.out.println(rev);
	}
	static String reverse(String s) {
		String rev=new StringBuffer(s).reverse().toString();
		return rev;
	}

}
