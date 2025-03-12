package org.jsp.StringPrograms;

public class ReverseAString {
	public static void main(String[] args) {
		String s1="nanda";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=s1.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}

}
