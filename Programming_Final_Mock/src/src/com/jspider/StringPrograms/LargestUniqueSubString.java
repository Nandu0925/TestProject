package com.jspider.StringPrograms;

public class LargestUniqueSubString {
	public static void main(String[] args) {
		String s="abacs";
		String uniq="";
		int len=0;
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i, j);
				if(isUnique(sub)) {
					if(sub.length()>len) {
						len=sub.length();
						uniq=sub;
					}
				}
			}
		}
		System.out.println(uniq);
	}
	static boolean isUnique(String s) {
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
				
			}
			
		}
		return true;
	}

}
