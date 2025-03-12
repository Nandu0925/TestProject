package org.jsp.StringPrograms;

public class WordCount {
	public static void main(String[] args) {
		String s1="ram is good";
		int count=0;
		char ch[]=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
