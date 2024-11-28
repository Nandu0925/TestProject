package com.jspider.Upcasting;
class Fruit{
	
}
class Apple extends Fruit{
	
}
class Banana extends Fruit{
	
}
class Mango extends Fruit{
	
}
class BigBasket{
	static void addToBasket(Fruit f) {
		System.out.println("fruit added");
	}
}
public class Mainclass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		Banana b=new Banana();
		Mango m=new Mango();
		
		BigBasket.addToBasket(a);
		BigBasket.addToBasket(b);
		BigBasket.addToBasket(m);

	}

}
