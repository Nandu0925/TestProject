package com.jspider.pureabstraction;
interface X{
	void play();
}
interface Y extends X{
	void send();
}
class Z implements Y{
	@Override
	public void play() {
		System.out.println("exicuting play()....");
	}

	@Override
	public void send() {
		System.out.println("exicuting send()....");
		
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		Z ref=new Z();
		ref.play();
		ref.send();
		
	}

}
