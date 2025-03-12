package com.jspider.StringPrograms;

public class ReplaceTheSpace {
	public static void main(String[] args) {
		String s="S A C H I N";
		String r="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ') 
				r=r+"A";
			else 
				r=r+s.charAt(i);
			}
			System.out.println(r);
		}
	}

