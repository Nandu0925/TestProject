package Com.jspider.FileHandling;

import java.io.File;

public class Program4 {
	public static void main(String[] args) {
		File ref=new File("C:/FILEIO/Demo.txt");
		boolean flag=ref.exists();
		if(flag==true) {
			System.out.println("location :"+ref.getAbsolutePath());
			System.out.println("length :"+ref.length());
		}
		else {
			System.out.println("file not found");
		}
	}

}
