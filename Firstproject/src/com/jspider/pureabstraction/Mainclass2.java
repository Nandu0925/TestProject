package com.jspider.pureabstraction;
interface Delta{
	void play();
	void disp();
}
class Example implements Delta{

	@Override
	public void play() {
		System.out.println("play()....");
		
	}

	@Override
	public void disp() {
		System.out.println("disp().....");
		
	}
	
}
public class Mainclass2 {
	public static void main(String[] args) {
		Delta obj=new Example();
		obj.play();
		obj.disp();
	}

}
