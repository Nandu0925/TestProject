package com.jspider.ConstructorChaining;
class Delta{
	Delta(){
		this(10);
		System.out.println("Delta() constructor");
	}
	Delta(int a){
		System.out.println("Delta(int) constructor");
	}
}
class Example extends Delta{
	Example(){
		super();
		System.out.println("Example() constructor");
	}
	Example(int a){
		this();
		System.out.println("Example(int) constructor");
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e=new Example(40);

	}

}
