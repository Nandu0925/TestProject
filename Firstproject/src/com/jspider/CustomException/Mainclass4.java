package com.jspider.CustomException;
class InvalidPincodeException extends Exception
{
	
}
class PincodeChecker{
	static void verifyPincode(String pincode) throws InvalidPincodeException
	{
		if(pincode.length()!=6) {
			throw new InvalidPincodeException();
		}
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		try {
			PincodeChecker.verifyPincode("123456");
		} catch (InvalidPincodeException e) {
			System.out.println("invalid pincode");
		}
	}

}
