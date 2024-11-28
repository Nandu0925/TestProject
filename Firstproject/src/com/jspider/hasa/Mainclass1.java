package com.jspider.hasa;
class Demo{
	void test() {
		System.out.println("exicuting test().....");
	}
}
class Sample{//Class is acting as container for an object for Demo class
	Demo d=new Demo();
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.d.test();

	}

}
