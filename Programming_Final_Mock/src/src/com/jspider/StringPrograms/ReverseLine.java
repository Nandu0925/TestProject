package com.jspider.StringPrograms;

public class ReverseLine {
	public static void main(String[] args) {
		String s="ram is good";
		String arr[]=s.split(" ");
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);
	}

}
