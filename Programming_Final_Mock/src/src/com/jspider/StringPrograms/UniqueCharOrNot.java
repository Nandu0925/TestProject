package com.jspider.StringPrograms;

public class UniqueCharOrNot {
	public static void main(String[] args) {
		String s="abca";
		if(isUnique(s)) {
			System.out.println("Unique");
			}
		else {
			System.out.println("Not Unique");
		}
	}
//	static boolean isUnique(String s) {
//		char ch[]=s.toCharArray();
//		boolean b[]=new boolean[ch.length];
//		for(int i=0;i<=ch.length-1;i++) {
//			if(b[i]==false) {
//				int count=1;
//				for(int j=i+1;j<=ch.length-1;j++) {
//					if(ch[i]==ch[j]) {
//						return false;
//					}
//				}
//				
//			}
//		}
//		return true;
//	}
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

