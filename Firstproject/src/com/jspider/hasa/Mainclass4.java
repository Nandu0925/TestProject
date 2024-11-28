package com.jspider.hasa;
class Department{
	void teach() {
		System.out.println("join the deportment");
	}
}
class Student{
	void learn() {
		System.out.println("Students are learning");
	}
}
class College{
	Department d=new Department();
	
	Student s=new Student();
}
public class Mainclass4 {

	public static void main(String[] args) {
		College c=new College();
		c.d.teach();
		c.s.learn();

	}

}
