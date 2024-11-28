package com.jspider.Upcasting;
class Alpha{
	void play() {
		System.out.println("exicuting play().....");
	}
}
class Beta extends Alpha{
	void send() {
		System.out.println("exicuting send().....");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta b=new Beta();
		b.play();
		b.send();
		Alpha a=b;//UPCASTING :Beta---->Alpha
		a.play();
		//a.send();//after the upcasting sub class members will hidden

	}

}
