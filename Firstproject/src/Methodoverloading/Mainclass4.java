package Methodoverloading;
class Launcher{
	void launch(int a) {
		System.out.println("lanch in crome");
	}
	void launch(double d) {
		System.out.println("launch in firefox");
	}
	void launch(String s) {
		System.out.println("launch in edge");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launcher ref=new Launcher();
		ref.launch(4.5);
		ref.launch(2);
		ref.launch("nanda");

	}

}
