package com.jspider.ObjectClass;
class Product
{
	private int pid=756;
	@Override
	public boolean equals(Object obj) {
		Product p=(Product)obj;
		if(this.pid==p.pid) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		System.out.println(p1.equals(p2));
	}

}
