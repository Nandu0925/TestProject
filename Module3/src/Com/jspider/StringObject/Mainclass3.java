package Com.jspider.StringObject;

public class Mainclass3 {
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("A");
		System.out.println(buffer.toString());
		System.out.println(buffer.hashCode());
		
		StringBuilder builder=new StringBuilder("a");
		System.out.println(builder.toString());
		System.out.println(builder.hashCode());
	}

}
