package com.jspider.Methodoverriding;
class FacebookOld{
	void reaction() {
		System.out.println("like");
	}
}
class FacebookNew extends FacebookOld{
	@Override
	void reaction() {
		System.out.println("like,wow,angry,love");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookOld fo=new FacebookOld();
		fo.reaction();
		FacebookNew fn=new FacebookNew();
		fn.reaction();
		FacebookNew fol=new FacebookNew();
		fol.reaction();

	}

}
