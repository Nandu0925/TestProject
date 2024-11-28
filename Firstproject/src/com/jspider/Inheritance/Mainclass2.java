package com.jspider.Inheritance;
class InstagramOld{
	void post() {
		System.out.println("uploading post....");
	}
}
class InstagramNew extends InstagramOld {
	void messenger() {
		System.out.println("sending message....");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstagramNew ref=new InstagramNew();
		ref.post();
		ref.messenger();

	}

}
