package com.jspider.hasa;
class Engine{
	void power() {
		System.out.println("exicuting pawer()......");
	}
}
class Driver{
	void driving() {
		System.out.println("exicuting driving().....");
	}
}
class Car{
	Engine e=new Engine();
	Driver d=new Driver();
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.e.power();
		c.d.driving();

	}

}
