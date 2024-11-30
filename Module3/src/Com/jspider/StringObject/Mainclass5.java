package Com.jspider.StringObject;

public class Mainclass5 {
	public static void main(String[] args) {
		int a=10;
		Integer ref=new Integer(a);//BOXING :int---->Integer//cross line is deprecated
		System.out.println(ref);
		
		double b=4.5;
		Double obj=b;//BOXING :double------>Double
		System.out.println(obj);
		
		char c='j';
		Character ch=c;//BOXING :char----->Character
		System.out.println(ch);
	}

}
