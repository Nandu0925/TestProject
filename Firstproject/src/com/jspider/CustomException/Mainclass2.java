package com.jspider.CustomException;
class InvalidMobileNumberException extends Exception
{
	
}
class MobileNumberVerifier
{
	static void checkMobileNumber(String mobile) throws InvalidMobileNumberException
	{
		if(mobile.length()!=10) {
			throw new InvalidMobileNumberException();
		}
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		try {
			MobileNumberVerifier.checkMobileNumber("1122334455");
		} catch (InvalidMobileNumberException e) {
			System.out.println("invalid Mobile Number detected");
		}
	}

}
