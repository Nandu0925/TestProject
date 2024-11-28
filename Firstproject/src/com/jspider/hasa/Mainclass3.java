package com.jspider.hasa;
class Camera{
	void takePhoto() {
		System.out.println("taking photo");
	}
}
class SimCard{
	void call() {
		System.out.println("put sim card");
	}
}
class Mobile{
	Camera c=new Camera();
	
	SimCard s=new SimCard();
	
}
public class Mainclass3 {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.c.takePhoto();
		m.s.call();
		

	}

}
