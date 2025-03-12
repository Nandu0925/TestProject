package Com.jspider.FilePermissions;

import java.io.File;

public class Example1 {
	public static void main(String[] args) {
		File f=new File("C:/FILEIO/Q.txt");
		if(f.exists()==true) {
			System.out.println("Readble: "+f.canRead());
			System.out.println("Writable: "+f.canWrite());
			System.out.println("Exicutable: "+f.canExecute());
		}
	}

}
