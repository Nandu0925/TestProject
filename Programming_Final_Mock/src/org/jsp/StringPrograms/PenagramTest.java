package org.jsp.StringPrograms;

import java.util.HashSet;

public class PenagramTest {
	public static void main(String[] args) {
		String s="Abcdefghijklmnopqrstuvwxyz";
		if(isPanagram(s)) {
			System.out.println("panagram");
		}else {
			System.out.println("not a panagram");
		}
	}
	public static boolean isPanagram(String s) {
		HashSet hs=new HashSet();
		s=s.toLowerCase();
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				hs.add(ch);
			}
		}
		return hs.size()==26;
		
	}

}
