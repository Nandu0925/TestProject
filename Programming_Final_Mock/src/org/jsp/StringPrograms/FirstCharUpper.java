package org.jsp.StringPrograms;

public class FirstCharUpper {
	public static void main(String[] args) {
		String s1="Ram is good";
		char ch[]=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}else if(ch[i]>='A' && ch[i]<='Z') {
					ch[i]=(char)(ch[i]+32);
				} 
			}
		}
		System.out.println(ch);
	}

}
