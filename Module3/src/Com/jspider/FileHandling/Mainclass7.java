package Com.jspider.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Mainclass7 {
	public static void main(String[] args) {
		FileWriter ref=null;
		try {
			ref=new FileWriter("C:/FILEIO/list.txt");
			ref.write("java");
			ref.write("\n");
			ref.write("Sql");
			ref.write("\n");
			ref.write(65);
			ref.write("\n");
			char[] ch= {'j','s'};
			ref.write(ch);
			ref.flush();
			System.out.println("write completed");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
