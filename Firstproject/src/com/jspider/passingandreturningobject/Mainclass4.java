package com.jspider.passingandreturningobject;

public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=Company.createDetails();
		Company.empDisplay(e1);
		
		Employee e2=Company.createDetails();
		Company.empDisplay(e2);
		
		Employee e3=Company.createDetails();
		Company.empDisplay(e3);

	}

}
