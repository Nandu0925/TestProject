package com.jspider.passingandreturningobject;
class Element{
	int id=101;
}
class ServiceProvider{
	static void test(Element e) {
		System.out.println("id:"+e.id);
	}
	static Element disp() {
		Element obj=new Element();
		return obj;
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element ref=ServiceProvider.disp();
		ServiceProvider.test(ref);
	}

}
