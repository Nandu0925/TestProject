package com.jspider.ObjectClass;
class OneTimePassword
{
	private int otp=4735;
	@Override
	public boolean equals(Object obj) {
		OneTimePassword otp=(OneTimePassword)obj;//downcasting
		if(this.otp==otp.otp) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		OneTimePassword otp1=new OneTimePassword();
		OneTimePassword otp2=new OneTimePassword();
		System.out.println(otp1.equals(otp2));
	}

}
