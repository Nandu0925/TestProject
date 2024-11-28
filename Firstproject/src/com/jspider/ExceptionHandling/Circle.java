package com.jspider.ExceptionHandling;

public class Circle {
	int radius=10;
	static void createCopy() throws CloneNotSupportedException
	{
		Circle c1=new Circle();
		c1.radius=25;
		Circle c2=(Circle)c1.clone();
		System.out.println(c2.radius);
	}
	public static void main(String[] args) {
		try {
			createCopy();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("clone failed");
		}
	}

}
