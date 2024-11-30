package Com.jspider.Thread;

class DemoThread extends Thread{
	@Override
	public void run() {
		for(int a=1;a<5;a++) {
			System.out.println(" demoThread.......");
		}
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		System.out.println("program starts........");
		DemoThread dt=new DemoThread();
		dt.start();
		for(int a=1;a<5;a++) {
			System.out.println("mainthread......");
		}
	}

}
