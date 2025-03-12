package Com.jspider.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Mainclass8 {
	public static void main(String[] args) {
		BufferedWriter ref=null;
		try {
			ref=new BufferedWriter(new FileWriter("C:/FILEIO/Demo.txt"));
			ref.write("Bangalore");
			ref.newLine();
			ref.write("vizag");
			ref.newLine();
			ref.write("Delhi");
			ref.newLine();
			ref.write("Hyderbad");
			ref.newLine();
			ref.write(97);
			ref.newLine();
			char[] ch= {'j','s','p','i','d','e','r'};
			ref.write(ch);
			ref.flush();
			System.out.println("write completed");
		}
		catch ( IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
