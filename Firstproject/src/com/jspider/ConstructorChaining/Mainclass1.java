package com.jspider.ConstructorChaining;
class Food{
	Food(int arg){
		System.out.println("Biryani");
	}
	Food(double arg){
		this(5);
		System.out.println("Shawarma");
	}
	Food(String arg){
		this(4.5);
		System.out.println("pani puri");
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f=new Food("java");

	}

}
