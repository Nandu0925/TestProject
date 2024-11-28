package com.jspider.partialabstraction;

abstract class Android{
	abstract void ui();
	void service() {
	}
}
class Samsung extends Android{
	@Override
	void ui() {
		System.out.println("Galaxy");
		
	}
}
class OnePlus extends Android{
	@Override
	void ui() {
		System.out.println("Oxigen");
	}
}
class Redmi extends Android{
	@Override
	void ui() {
		System.out.println("miui");
		
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		Android a;
		a=new Samsung();
		a.ui();
		a=new OnePlus();
		a.ui();
		a=new Redmi();
		a.ui();

	}

}
