package com.jspider.Constructoroverloading;

class Demo{
	Demo(int a){
		System.out.println("demo(int) constructor");
	}
	Demo(double d){
		System.out.println("demo(double) constructor");
	}
	Demo(String s){
		System.out.println("demo(String) constructor");
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo(10);
		Demo d2=new Demo(4.4);
		Demo d3=new Demo("nanda");
		

	}

}
