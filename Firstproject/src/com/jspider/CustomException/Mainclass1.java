package com.jspider.CustomException;
class CustomException extends Exception
{
	
}
class Trigger
{
	static void verify(int num) throws CustomException
	{
		if(num%2==0&&num%5==0) {
			throw new CustomException();
		}
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		try {
			Trigger.verify(15);
			Trigger.verify(20);
		}
		catch(CustomException e) {
			System.out.println("custom exception");
		}
	}
}
