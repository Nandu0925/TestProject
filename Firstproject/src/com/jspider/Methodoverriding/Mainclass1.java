package com.jspider.Methodoverriding;
class Parent{
	void watchTv() {
		System.out.println("watching news/serials");
	}
}
class Child extends Parent{
	@Override
	void watchTv() {
		System.out.println("watching series/movies");
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.watchTv();
		Child c=new Child();
		c.watchTv();
		Parent ref=new Child();
		ref.watchTv();

	}

}
