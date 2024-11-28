package com.jspider.ExceptionHandling;
class Example{
	void test() {
		System.out.println("executing test()......");
	}
}
public class Program3 {
	public static void main(String[] args) {
		try {
			Example ex=(Example)Class.forName("com.jspider.ExceptionHandling.Example").newInstance();
			ex.test();
		}
		catch(ClassNotFoundException e) {
			System.out.println("no such class");
		}
		catch(IllegalAccessException e) {
			System.out.println("access denied");
		}
		catch(InstantiationException e) {
			System.out.println("object creation failed");
		}
	}

}
