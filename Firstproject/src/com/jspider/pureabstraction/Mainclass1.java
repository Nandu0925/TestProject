package com.jspider.pureabstraction;
interface Demo{
	void test();
}
class Sample implements Demo{
	@Override
	public void test() {
		System.out.println("test()....");
		
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Demo d=new Sample();
		d.test();
	}

}