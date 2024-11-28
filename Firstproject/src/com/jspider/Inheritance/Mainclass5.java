package com.jspider.Inheritance;
class Sprint1{
	void f1() {
		System.out.println("pramod is a good boy");
	}
	void f2() {
		System.out.println("pramod is from karnataka");
	}
	void f3() {
		System.out.println("he is staying in bangulore");
	}
}
class Sprint2 extends Sprint1{
	void f4() {
		System.out.println("sourab is a good boy");
	}
	void f5() {
		System.out.println("sourab is from belagavi");
	}
	void f6() {
		System.out.println("sourab is living in the bangulore");
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sprint2 s1=new Sprint2();
		s1.f1();
		s1.f2();
		s1.f3();
		s1.f4();
		s1.f5();
		s1.f6();
		Sprint1 s2=new Sprint1();
		s2.f1();
		s2.f2();
		s2.f3();
//		s2.f4();
//		s2.f5();
//		s2.f6();

	}

}
