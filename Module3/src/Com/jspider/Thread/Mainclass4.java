package Com.jspider.Thread;

public class Mainclass4 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		for(int a=1;a<=5;a++) {
			Thread th=Thread.currentThread();
			System.out.println("Id:"+th.getId()+"Name:"+th.getName()+"Priority:"+th.getPriority());
		}
		System.out.println("Program ends");
	}

}
