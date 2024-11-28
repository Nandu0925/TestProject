package Methodoverloading;
class Flipkart{
	void payment() {
		System.out.println("COD");
	}
	void payment(String upi) {
		System.out.println("UPI");
	}
	void payment(long l) {
		System.out.println("CARD");
	}
	void payment(String un,String pwd) {
		System.out.println("NETBANKING");
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart a=new Flipkart();
		a.payment();
		a.payment(9464873659l);
		a.payment("nandu@icici");
		a.payment("nanda8096", "nanda");
				

	}

}
