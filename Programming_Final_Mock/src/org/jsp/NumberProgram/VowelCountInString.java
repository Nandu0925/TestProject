package org.jsp.NumberProgram;

public class VowelCountInString {
	public static void main(String[] args) {
		String s="scanner is a class";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++) {
			String word="";
			while(i<=ch.length-1&&ch[i]!=' ') {
				word=word+ch[i];
				i++;
			}
			int count=countVowels(word);
			System.out.println(word+" - "+count);
		}
	}
	private static int countVowels(String s) {
		
			int count=0;
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
				}
			}
			return count;
	}

}
