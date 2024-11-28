package Methodoverloading;
class Facebook{
	void login(String email,String password) {
		System.out.println("login with emailID and password");
	}
	void login(long mobileNumber,String password) {
		System.out.println("login with mobile number and password");
	}
	
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook fb=new Facebook();
		fb.login(8096858246l, "nanda");
		fb.login("nandu@8096", "nanda");

	}

}
