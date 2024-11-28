package com.jspider.passingandreturningobject;

import java.util.Scanner;

public class Flipkart {
	static Product createProduct()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter pid");
		int a=scn.nextInt();
		System.out.println("enter price");
		double b=scn.nextDouble();
		Product p=new Product(a,b);
		return p;

	}
	static void displayProduct(Product p) {
		System.out.println("pid:"+p.pid);
		System.out.println("price:"+p.price);
	}
}
