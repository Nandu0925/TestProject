package com.jspider.instanceOf;
class Fruit{
	
}
class Apple extends Fruit{
	
}
class Mango extends Fruit{
	
}
class Banana extends Fruit{
	
}
class BigBasket{
	static void addToBasket(Fruit f) {
		if(f instanceof Apple) {
			System.out.println("Apple added");
		}
		else if(f instanceof Mango) {
			System.out.println("mango added");
		}
		else if(f instanceof Banana) {
			System.out.println("Banana added");
		}
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		BigBasket.addToBasket(a);
		
		Mango m=new Mango();
		BigBasket.addToBasket(m);
		
		Banana b=new Banana();
		BigBasket.addToBasket(b);
		

	}

}
