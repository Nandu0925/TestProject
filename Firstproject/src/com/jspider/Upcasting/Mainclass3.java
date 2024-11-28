package com.jspider.Upcasting;
class Delta{
	void run() {
		System.out.println("Exicuting run()....");
	}
}
class Example extends Delta{
	void help() {
		System.out.println("Exicuting help()....");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delta d=new Example();//UPCASTING :Example---->Delta
		d.run();

	}

}
