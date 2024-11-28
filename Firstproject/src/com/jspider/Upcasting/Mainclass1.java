package com.jspider.Upcasting;
class Demo{
	
}
class Sample extends Demo{
	
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ref=new Sample();
		Demo obj=ref;//UPCASTING :Sample--->Demo
		System.out.println(ref);
		System.out.println(obj);

	}

}
