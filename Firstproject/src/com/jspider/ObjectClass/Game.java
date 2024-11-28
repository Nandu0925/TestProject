package com.jspider.ObjectClass;

public class Game implements Cloneable
{
	int hiScore=100;
	public static void main(String[] args) throws CloneNotSupportedException{
		Game original=new Game();
		original.hiScore=5000;
		System.out.println(original);//original object
		
		Game copy=(Game)original.clone();
		System.out.println(copy);//copy of object
	}

}
