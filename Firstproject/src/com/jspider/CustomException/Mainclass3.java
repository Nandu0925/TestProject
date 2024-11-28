package com.jspider.CustomException;
class OverSpeedException extends Exception
{
	
}
class Police
{
	static void verifySpeed(int speed) throws OverSpeedException
	{
		if(speed>80) {
			throw new OverSpeedException();
		}
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		try {
			Police.verifySpeed(80);
		} catch (OverSpeedException e) {
			System.out.println("fine fine");
		}
	}

}
