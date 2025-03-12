package com.jspider.StringPrograms;

import java.util.HashMap;

public class CollectOccur {
	public static void main(String[] args) {
		String s="abac";
		HashMap<Character, Integer> hs=new HashMap();
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(hs.containsKey(ch)) {
				hs.put(ch, hs.get(ch)+1);
			}
			else
				hs.put(ch, 1);
		}
		System.out.println(hs);		
	}

}



