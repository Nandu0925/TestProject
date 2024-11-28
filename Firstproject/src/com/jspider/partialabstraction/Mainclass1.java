package com.jspider.partialabstraction;
abstract class Demo{
	abstract void test();
	abstract void disp();
}
class Sample extends Demo{
	@Override
	void test() {
		System.out.println("exicuting test()....");
	}
	@Override
	void disp() {
		System.out.println("exicuting disp()....");
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Sample();
		d.test();
		d.disp();

	}

}
