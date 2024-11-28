package com.jspider.SingletonClass;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c1=Connection.getConnection();
		Connection c2=Connection.getConnection();
		Connection c3=Connection.getConnection();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		

	}

}
