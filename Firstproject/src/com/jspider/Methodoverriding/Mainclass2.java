package com.jspider.Methodoverriding;
class Demo{
	void play() {
		System.out.println("cricket");
	}
}
class Sample extends Demo{
	@Override
	void play() {
		System.out.println("PUBG");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.play();
		Sample s=new Sample();
		s.play();
		Demo ref=new Sample();
		ref.play();

	}

}
