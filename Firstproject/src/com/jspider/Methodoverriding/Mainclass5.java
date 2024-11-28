package com.jspider.Methodoverriding;
class Gmailv1{
	void compose() {
		System.out.println("open newTab in browser");
	}
}
class Gmailv2 extends Gmailv1{
	@Override
	void compose() {
		System.out.println("create a pop up box");
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmailv1 g;
		g=new Gmailv1();
		g.compose();
		g=new Gmailv2();
		g.compose();

	}

}
