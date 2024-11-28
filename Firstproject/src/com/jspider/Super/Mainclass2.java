package com.jspider.Super;
class Version1{
	void feature() {
		System.out.println("read");
	}
}
class Version2 extends Version1{
	@Override
	void feature() {
		System.out.println("write");
		super.feature();
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Version1 v1=new Version2();
		v1.feature();

	}

}
