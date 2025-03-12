package Com.jspider.FileHandling;

import java.io.File;

public class Program1 {
	public static void main(String[] args) {
		File ref=new File("C:/FILEIO/IMAGE");
		boolean flag=ref.exists();
		if(flag==false) {
			ref.mkdir();//creates a folder
			System.out.println("folder/directry created");
		}
		else {
			System.out.println("folder already exists");
		}
	}

}
