package Com.jspider.Thread;
class ExampleThread implements Runnable{
	@Override
	public void run() {
		for(int x=1;x<=5;x++) {
			Thread th=Thread.currentThread();
			System.out.println("Id:"+th.getId()+"Name:"+th.getName()+"Priority:"+th.getPriority());
		}

	}

}
public class Mainclass5 {
	public static void main(String[] args) {
		Thread th1=new Thread(new ExampleThread());
		th1.setName("a25");
		th1.setPriority(10);
		Thread th2=new Thread(new ExampleThread());
		th2.setName("m17");
		th2.setPriority(1);
		th1.start();
		th2.start();
		
	}

}
