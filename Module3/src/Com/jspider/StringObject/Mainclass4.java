package Com.jspider.StringObject;

public class Mainclass4 {
	public static void main(String[] args) {
		String str="Java";
		System.out.println(str);
		str=str+"Jspiders";
		System.out.println(str);
		StringBuffer buffer=new StringBuffer("testing");
		System.out.println(buffer);
		buffer.append(buffer);
		System.out.println(buffer);
		
		StringBuilder builder=new StringBuilder("Python");
		System.out.println(builder);
		builder.append("Pyspiders");
		System.out.println(builder);
		
	}
}
