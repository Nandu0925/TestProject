package com.jspider.partialabstraction;
abstract class Hotstar{
	void login() {
		
	}
	abstract void watch();
	
}
class Hotstarfree extends Hotstar{
	@Override
	void watch() {
		System.out.println("ad+trailer");
		
	}
}
class Hotstarvip extends Hotstar{
	@Override
	void watch() {
		System.out.println("ad+regional");
		
	}
}
class Hotstarpremium extends Hotstar{
	@Override
	void watch() {
		System.out.println("all content");
		
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		Hotstar hs;
		hs=new Hotstarfree();
		hs.watch();
		hs=new Hotstarvip();
		hs.watch();
		hs=new Hotstarpremium();
		hs.watch();

	}

}
