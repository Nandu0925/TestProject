package com.jspider.Inheritance;
class SwiffyV1{
	void orderFood() {
		System.out.println("ordering the food......");
	}
}
class SwiffyV2 extends SwiffyV1{
	void orderGroceries() {
		System.out.println("orderring groceries....");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwiffyV2 v2=new SwiffyV2();
		v2.orderFood();
		v2.orderGroceries();

	}

}
