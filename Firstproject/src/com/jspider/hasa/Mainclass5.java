package com.jspider.hasa;
class Account{
	void withdraw() {
		System.out.println("withdraw maney");
	}
}
class Customer{//Composition
	Account a=new Account();
}
class Bank{//Aggrigation
	Customer c=new Customer();
}
public class Mainclass5 {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.c.a.withdraw();

	}

}
