package com.jspider.downcasting;
class Alpha{
	void test() {
		System.out.println("exicuting test()......");
	}
}
class Beta extends Alpha{
	void disp() {
		System.out.println("exicuting disp()......");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a=new Beta();
		a.test();
		Beta b=(Beta)a;
		b.test();
		b.disp();

	}

}
