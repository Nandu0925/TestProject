package com.jspider.accessmodifiers.random;

public class MainOpertaion implements SomeOper {
	public void buy(){
		System.out.println("You must be buy a GamingLaptop");
	}
	
	
	
	public static void main(String[] args) {
		MainOpertaion ob=new MainOpertaion();
		ob.buy();
				
	}

}
