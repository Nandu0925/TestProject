package com.jspider.Upcasting;
class Product{
	
}
class Mobile extends Product{
	
}
class Television extends Product{
	
}
class Book extends Product{
	
}
class FlipKart{
	static void addToCart(Product p) {
		System.out.println("product is added to cart");
	}
}
public class Mainclass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		Television t=new Television();
		Book b=new Book();
		
		FlipKart.addToCart(m);
		FlipKart.addToCart(t);
		FlipKart.addToCart(b);

	}

}
