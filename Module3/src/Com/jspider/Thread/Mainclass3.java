package Com.jspider.Thread;

public class Mainclass3 {
	public static void main(String[] args) {
		System.out.println("program starts");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("program ends");
	}

}
