package Com.jspider.FileHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class Mainclass9 {
	public static void main(String[] args) {
		PrintWriter ref=null;
		try {
			ref=new PrintWriter("C:/FILEIO/config.txt");
			ref.println("Karnataka");
			ref.println(100);
			ref.println(6.7);
			ref.println(true);
			ref.flush();
			System.out.println("write completed");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			ref.close();
		}
	}

}
