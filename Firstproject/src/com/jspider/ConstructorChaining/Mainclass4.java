package com.jspider.ConstructorChaining;
class Alpha{
	Alpha(){
		System.out.println("Alpha() constructor");
	}
	Alpha(int a){
		this();
		System.out.println("Alpha(int) constructor");
	}
}
class Beta extends Alpha{
	Beta(){
		super();
		System.out.println("Beta() constructor");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta b=new Beta();

	}

}
