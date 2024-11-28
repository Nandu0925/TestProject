package com.jspider.pureabstraction;
interface Alpha{
	void run();
}
interface Beta{
	void send();
}
class Gamma implements Alpha,Beta{

	@Override
	public void send() {
		System.out.println("send().....");
		
	}

	@Override
	public void run() {
		System.out.println("run().....");
		
	}
	
}
public class Mainclass3 {
	public static void main(String[] args) {
		Gamma g=new Gamma();
		g.send();
		g.run();
	}

}
