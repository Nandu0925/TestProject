package com.jspider.ObjectClass;

public class Circle implements Cloneable
{
	int radius=10;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle c1=new Circle();
		c1.radius=25;
		
		Circle c2=(Circle)c1.clone();
		System.out.println(c2.radius);
	}
	
}
