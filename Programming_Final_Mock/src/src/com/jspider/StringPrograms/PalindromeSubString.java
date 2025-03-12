package com.jspider.StringPrograms;

public class PalindromeSubString {
	public static void main(String[] args) {
		String s="ababaca";
		String longest="";
		int len=0;
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length()-1;j++) {
				String sub=s.substring(i, j);
				if(isPall(sub))
//					System.out.println(sub);
				if(sub.length()>len) {
					len=sub.length();
					longest=sub;
				}
			}
		}
		System.out.println(longest);
	}
	static boolean isPall(String s) {
		String rev=new StringBuffer(s).reverse().toString();
		return s.equals(rev);
	}

}
