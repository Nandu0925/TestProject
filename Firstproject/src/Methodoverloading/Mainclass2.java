package Methodoverloading;
class Irctc{
	void search(String src,String dest) {
		System.out.println("Source and destination");
	}
	void search(int trainNumber) {
		System.out.println("Train number");
	}
	void search(String pnr) {
		System.out.println("PNR");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Irctc ref=new Irctc();
		ref.search("tpt", "bng");
		ref.search(12034);
		ref.search("t25573");

	}

}
