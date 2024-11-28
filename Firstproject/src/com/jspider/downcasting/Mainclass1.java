package com.jspider.downcasting;
class Demo{
	
}
class Sample extends Demo{
	
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Sample();
		Sample s=(Sample)d;
		System.out.println(d);
		System.out.println(s);

	}

}
