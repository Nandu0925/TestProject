package com.jspider.StringPrograms;

public class Demo4 {
	public static void main(String[] args) {
		String s="ram is good";
		char[] ch=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==ch.length-1&& ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
				else if(ch[i]>='A' && ch[i]<='Z'){
					ch[i]=(char)(ch[i]+32);
				}
			}
			
		}
		System.out.println(ch);
		
	}
	

}
