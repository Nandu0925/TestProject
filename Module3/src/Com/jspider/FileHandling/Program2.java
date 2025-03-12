package Com.jspider.FileHandling;

import java.io.File;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		File ref=new File("C:/FILEIO/C.txt");
		boolean flag=ref.exists();
		if(flag==false) {
			try {
				ref.createNewFile();//file creating
				System.out.println("file created");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("file exists");
		}
	}

}
