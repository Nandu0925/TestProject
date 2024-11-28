package com.jspider.pureabstraction;
class A{
	void test(){
		System.out.println("exicuting test().....");
		}
}
interface B{
	void Disp();
}
class C extends A implements B{
	@Override
	public void Disp() {
		System.out.println("exicuting the disp()......");
		
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		C ref=new C();
		ref.test();
		ref.Disp();
		
	}

}
