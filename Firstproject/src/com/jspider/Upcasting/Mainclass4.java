package com.jspider.Upcasting;
class A{
	void test() {
		System.out.println("exicuting test()....");
	}
}
class B extends A{
	void disp() {
		System.out.println("exicuting disp()....");
	}
}
class C extends B{
	void play() {
		System.out.println("exicuting play()...");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		c1.disp();
		c1.test();
		c1.play();
		
		B b1=c1;
		b1.disp();
		b1.test();
		
		A a1=b1;
		a1.test();
		

	}

}
