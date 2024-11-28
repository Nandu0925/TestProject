package com.jspider.passingandreturningobject;

import java.util.Scanner;

public class Company {
	static Employee createDetails() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter employee eid:");
		int a=scn.nextInt();
		System.out.println("enter ctc:");
		double b=scn.nextDouble();
		Employee e=new Employee(a,b);
		return e;
	}
	static void empDisplay(Employee e) {
		System.err.println("eid:"+e.eid);
		System.out.println("ctc:"+e.ctc);
	}

}
