package com.jspider.Inheritance;
class Whatsapp1{
	void message() {
		System.out.println("messaging.....");
	}
}
class Whatsapp2 extends Whatsapp1{
	void call() {
		System.out.println("calling.....");
	}
}
class Whatsapp3 extends Whatsapp2{
	void story() {
		System.out.println("story.....");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whatsapp3 ref=new Whatsapp3();
		ref.message();
		ref.call();
		ref.story();
		
		Whatsapp2 ref1=new Whatsapp3();
		ref1.message();
		ref1.call();
		
		Whatsapp1 ref2=new Whatsapp3();
		ref2.message();
	}

}
