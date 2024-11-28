package com.jspider.partialabstraction;
abstract class Antivirus{
	void install() {
		
	}
	abstract void scan();
}
class FreeAntivirus extends Antivirus{
	@Override
	void scan() {
		System.out.println("basic scan");
		
	}
}
class PaidAntivirus extends Antivirus{
	@Override
	void scan() {
		System.out.println("advanced scan");
		
	}
}
class EnterpriseAntivirus extends Antivirus{
	@Override
	void scan() {
		System.out.println("server scan");
		
	}
}
public class Mainclass6 {

	public static void main(String[] args) {
		Antivirus as;
		as=new FreeAntivirus();
		as.scan();
		as=new PaidAntivirus();
		as.scan();
		as=new EnterpriseAntivirus();
		as.scan();
		

	}

}
