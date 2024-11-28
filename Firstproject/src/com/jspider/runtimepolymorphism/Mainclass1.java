package com.jspider.runtimepolymorphism;
class Food{
	void eat() {
		System.out.println("eating food");
	}
}
class Vegitarian extends Food{
	@Override
	void eat() {
		System.out.println("eating vegitarian food");
	}
}
class NonVegitarian extends Food{
	@Override
	void eat() {
		System.out.println("eating nonvegitarian food");
	}
}
class Hotel{
	static void serve(Food f) {
		if(f!=null) {
			f.eat();
		}
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vegitarian v=new Vegitarian();
		NonVegitarian n=new NonVegitarian();
		Hotel.serve(v);
		Hotel.serve(n);

	}

}
