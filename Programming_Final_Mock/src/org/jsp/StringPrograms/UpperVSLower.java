package org.jsp.StringPrograms;

public class UpperVSLower {
	public static void main(String[] args) {
		String s1="AbCd";
		char ch[]=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}else if(ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println(ch);
	}

}
