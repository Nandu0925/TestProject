package Com.jspider.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mainclass11 {
	public static void main(String[] args) {
		BufferedReader ref=null;
		try {
			ref=new BufferedReader(new FileReader("C:/FILEIO/readme.txt"));
			String str=ref.readLine();
			while(str!=null) {
				System.out.println(str);
				str=ref.readLine();
			}
		}
		catch(IOException e) {
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
