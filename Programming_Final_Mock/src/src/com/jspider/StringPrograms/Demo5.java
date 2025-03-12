package com.jspider.StringPrograms;

public class Demo5 {
	public static void main(String[] args) {
		String s="ram is good";
		int f=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				f=i;
			}
			else if(i==ch.length-1&& ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}
		}
		System.out.println(ch);
	}
}
