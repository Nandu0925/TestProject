package com.jspider.partialabstraction;
abstract class Delta{
	void run() {
		System.out.println("exicuting run().....");
	}
	void push() {
		System.out.println("exicuting push().....");
	}
}
class Example extends Delta{
	
}
public class Mainclass3 {

	public static void main(String[] args) {
		Delta d=new Example();
		d.run();
		d.push();

	}

}
