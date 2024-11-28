package com.jspider.ObjectClass;

public class DataBackUp implements Cloneable
{
	int size=0;
	public static void main(String[] args) throws CloneNotSupportedException {
		DataBackUp db=new DataBackUp();
		db.size=5;
		
		DataBackUp copy=(DataBackUp)db.clone();
		System.out.println(copy.size);
	}

}
