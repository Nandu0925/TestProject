package com.jspider.partialabstraction;
abstract class Alpha{
	abstract void play();
	void send() {
		System.out.println("exicuting send()......");
	}
}
class Beta extends Alpha{
	@Override
	void play() {
		System.out.println("exicuting play()......");
		
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a=new Beta();
		a.send();
		a.play();

	}

}
