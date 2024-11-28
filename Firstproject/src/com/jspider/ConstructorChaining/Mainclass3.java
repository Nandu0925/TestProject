package com.jspider.ConstructorChaining;
class Demo{
	Demo(){
		System.out.println("Demo() constructor");
	}
}
class Sample extends Demo{
	Sample(){
		super();
		System.out.println("Sample() constructor");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();

	}

}
