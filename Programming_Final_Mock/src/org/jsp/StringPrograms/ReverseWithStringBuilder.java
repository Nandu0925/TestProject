package org.jsp.StringPrograms;

public class ReverseWithStringBuilder {
	public static void main(String[] args) {
		String s1="abcba";
		String rev=new StringBuilder(s1).reverse().toString();
		if(s1.equals(rev)) {
			System.out.println("palindrone");
		}else {
			System.out.println("not a palindrone");
		}
	}

}
