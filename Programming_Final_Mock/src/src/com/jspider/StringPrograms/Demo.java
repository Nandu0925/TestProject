package com.jspider.StringPrograms;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String s="AbCd";
		char[] ch=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a' && ch[i]<='z'){
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println(ch);
	}

}
