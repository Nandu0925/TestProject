package com.jspider.Methodoverriding;
class AdobeFree{
	void feature() {
		System.out.println("view");
	}
}
class AdobePaid extends AdobeFree{
	@Override
	void feature() {
		System.out.println("view-convert");
	}
}
public class Mainclass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdobeFree ad;
		ad=new AdobeFree();
		ad.feature();
		ad=new AdobePaid();
		ad.feature();

	}

}
