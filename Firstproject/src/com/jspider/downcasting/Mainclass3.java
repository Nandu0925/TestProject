package com.jspider.downcasting;
class A{
	void test() {
		System.out.println("N");
	}
}
class B extends A{
	void disp() {
		System.out.println("U");
	}
}
class C extends B{
	void play() {
		System.out.println("K");
		
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new C();//
		a1.test();
		B b1=(B)a1;//Downcasting :A--->B
		b1.test();
		b1.disp();
		C c1=(C)b1;//Downcasting :B--->C
		c1.test();
		c1.disp();
		c1.play();

	}

}
