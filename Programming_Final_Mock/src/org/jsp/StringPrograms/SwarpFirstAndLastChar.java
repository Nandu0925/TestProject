package org.jsp.StringPrograms;

public class SwarpFirstAndLastChar {
	public static void main(String[] args) {
		String s1="ram is good";
		int f=0;
		char ch[]=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==0&&ch[i]!=' ' ||ch[i]!=' '&&ch[i-1]==' ') {
				f=i;
			}else if(i==ch.length-1&& ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				char t=ch[f];
				ch[f]=ch[i];
				ch[i]=t;
			}
		}
		
		System.out.println(ch);
	}

}
