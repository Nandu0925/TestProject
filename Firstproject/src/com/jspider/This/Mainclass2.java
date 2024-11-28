package com.jspider.This;
class Utility{
	int a=10;
	void test() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		u.test();

	}

}
