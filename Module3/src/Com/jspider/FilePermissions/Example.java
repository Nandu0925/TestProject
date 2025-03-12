package Com.jspider.FilePermissions;

import java.io.File;
import java.io.IOException;

public class Example {
	public static void main(String[] args) {
		File f=new File("C:/FILEIO/Q.txt");
		if(f.exists()==false) {
			try {
				f.createNewFile();
				System.out.println("file created");
				f.setReadable(false);
				f.setWritable(false);
				f.setExecutable(false);
				System.out.println("permission assigned");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
