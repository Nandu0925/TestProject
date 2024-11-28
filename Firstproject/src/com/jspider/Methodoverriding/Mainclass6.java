package com.jspider.Methodoverriding;
class Windows10{
	void start() {
		System.out.println("list view");
	}
}
class Windows11 extends Windows10{
	@Override
	void start() {
		System.out.println("Grid view");
	}
}
public class Mainclass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Windows10 w;
		w=new Windows10();
		w.start();
		w=new Windows11();
		w.start();

	}

}
