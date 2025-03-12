package com.jspider.StringPrograms;

import java.util.HashSet;

public class Demo6 {
	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		if(isPangagram(s))
			System.out.println("panagram");
		else
			System.out.println("not a panagram");
	}
	static boolean isPangagram(String s) {
		HashSet hs=new HashSet();
		s=s.toLowerCase();
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
			hs.add(ch);
			}
		}
		return hs.size()==26;
	}

}
