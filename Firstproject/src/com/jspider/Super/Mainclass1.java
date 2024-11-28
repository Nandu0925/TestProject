package com.jspider.Super;
class Demo{
	int val=10;
	void run() {
		System.out.println("exicuting run()........");
	}
}
class Sample extends Demo{
	int val=20;
	void play() {
		System.out.println(this.val);
		System.out.println(super.val);
		super.run();
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.play();

	}

}
