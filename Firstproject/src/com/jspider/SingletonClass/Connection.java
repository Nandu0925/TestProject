package com.jspider.SingletonClass;

public class Connection {
	private static Connection con=null;//--->lazy initialization
	
	public static Connection getConnection() {
		if(con==null) {
			con=new Connection();
		}
		return con;
	}
	private Connection() {
		
	}

}
