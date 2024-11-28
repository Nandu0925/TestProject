package com.jspider.ConstructorChaining;
class City{
	City(){
		System.out.println("New York");
	}
	City(int arg){
		this();
		System.out.println("London");
	}
	City(double arg){
		this(10);
		System.out.println("paris");
	}
}
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c=new City(3.7);
		

	}

}
