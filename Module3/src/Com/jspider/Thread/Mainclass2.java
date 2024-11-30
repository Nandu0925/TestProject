package Com.jspider.Thread;
class SampleThread implements Runnable{
	@Override
	public void run() {
		for(int a=1;a<=5;a++) {
			System.out.println("SampleThread..........");
		}
		
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		System.out.println("program starts");
		SampleThread st=new SampleThread();
		Thread th=new Thread(st);
		th.start();
		for(int a=1;a<=5;a++) {
			System.out.println("MainThread....");
		}
		System.out.println("program ends");
	}

}
