package com.jspider.CustomException;
class MinnerException extends Exception
{
	
}
class SocialMedia{
	static void ageVerifier(int age) throws MinnerException
	{
		if(age<20) {
			throw new MinnerException();
		}
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		try {
			SocialMedia.ageVerifier(19);
		} catch (MinnerException e) {
			System.out.println("Invalid age exception");
		}
	}

}
