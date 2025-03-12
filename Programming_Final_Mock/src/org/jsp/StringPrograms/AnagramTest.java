package org.jsp.StringPrograms;

import java.util.Arrays;

public class AnagramTest {
	public static void main(String[] args) {
		String s1="nanda";
		String s2="nanda";
		if(s1.length()==s2.length()) {
			if(isAnagram(s1,s2)) {
				System.out.println("anagram");
				
			}else {
				System.out.println("not an anagram");
			}
			
		}
	}
	public static boolean isAnagram(String s1,String s2) {
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch1);
		String s3=new String(ch1);
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch2);
		String s4=new String(ch2);
		if(s3.equals(s4)) {
			return true;
		}else {
			return false;
		}
		
	}
}
