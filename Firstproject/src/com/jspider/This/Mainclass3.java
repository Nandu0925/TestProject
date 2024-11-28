package com.jspider.This;
class Manager{
	int mgrId;
	void meeting() {
		System.out.println("Manager is in meeting");
	}
	void status() {
		System.out.println("manager is doing status report");
	}
	void manage() {
		System.out.println(this.mgrId);
		this.meeting();
		this.status();
	}
	Manager(int mgrId){
		this.mgrId=mgrId;
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(420);
		m.manage();
		

	}

}
