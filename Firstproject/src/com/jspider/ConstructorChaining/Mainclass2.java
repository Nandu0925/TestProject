package com.jspider.ConstructorChaining;
class Amazon{
	Amazon(){
		System.out.println("Shopping Initiakization");
	}
	Amazon(double b){
		this();
		System.out.println("video and music initialization");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a1=new Amazon();
		System.out.println("hello");
		Amazon a2=new Amazon(4.5);

	}

}
