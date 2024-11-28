package com.jspider.ExceptionHandling;

public class DataBackUp {
	int size=0;

	public static void main(String[] args) {
		System.out.println("program starts");
		DataBackUp db=new DataBackUp();
		db.size=5;
		try {
			DataBackUp copy=(DataBackUp)db.clone();
			System.out.println(copy.size);
		}
		catch(CloneNotSupportedException e) {
			System.out.println("object is not clonable type");
		}
		System.out.println("program ends");
		

	}

}
