package com.jspider.ObjectClass;
class Account
{
	private long accountNumber=87654321123l;
	private double accountBalance=25000.0;
	@Override
	public boolean equals(Object obj) {
		Account a=(Account)obj;//downcasting
		if(this.accountBalance==a.accountBalance&&this.accountNumber==a.accountNumber) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		Account a1=new Account();
		Account a2=new Account();
		System.out.println(a1.equals(a2));
	}

}
