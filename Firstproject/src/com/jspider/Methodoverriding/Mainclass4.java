package com.jspider.Methodoverriding;
class Whatsapp1{
	void deliveryReport() {
		System.out.println("Sent");
	}
}
class Whatsapp2 extends Whatsapp1{
	@Override
	void deliveryReport() {
		System.out.println("sent-Delivery");
	}
}
class Whatsapp3 extends Whatsapp2{
	@Override
	void deliveryReport() {
		System.out.println("sent-delivery-seen");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whatsapp1 w;
		w=new Whatsapp1();
		w.deliveryReport();
		w=new Whatsapp2();
		w.deliveryReport();
		w=new Whatsapp3();
		w.deliveryReport();

	}

}
