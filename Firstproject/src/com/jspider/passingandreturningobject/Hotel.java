package com.jspider.passingandreturningobject;

import java.util.Scanner;

public class Hotel {
	static void display(Biriyani b) {
		System.out.println("name:"+b.name);
		System.out.println("quntity:"+b.qty);
		System.out.println("price:"+b.price);
	}
	static Biriyani create() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Quantity");
		int q=scn.nextInt();
		System.out.println("price");
		double p=scn.nextDouble();
		System.out.println("name");
		String n=scn.next();
		Biriyani b=new Biriyani(n,q,p);
		return b;
		
	}

}
