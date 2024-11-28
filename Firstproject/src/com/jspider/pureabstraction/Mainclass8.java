package com.jspider.pureabstraction;
//Sonmicrosystems
interface Driver{
	void register();
}
//oracle
class OracleDriver implements Driver{
	@Override
	public void register() {
		System.out.println("Oracle");
		
	}
}
//IBM
class DB2Driver implements Driver{
	@Override
	public void register() {
		System.out.println("IBM");
		
	}
}
//Microsoft
class MicrosoftDriver implements Driver{
	@Override
	public void register() {
		System.out.println("Microsoft");
		
	}
}
//Sonmicrosystems
class DriverManager{
	static void registerDriver(Driver ref) {
		if(ref!=null) {
			ref.register();
		}
	}
}
public class Mainclass8 {
	public static void main(String[] args) {
		OracleDriver v=new OracleDriver();
		DriverManager.registerDriver(v);
		DB2Driver d=new DB2Driver();
		DriverManager.registerDriver(d);
		MicrosoftDriver m=new MicrosoftDriver();
		DriverManager.registerDriver(m);
	}

}
