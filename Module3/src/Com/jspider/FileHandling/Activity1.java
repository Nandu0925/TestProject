package Com.jspider.FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Activity1 {
	public static void main(String[] args)throws IOException {
		File f1=new File("C:/FILEIO");
		if(f1.exists()==true) {
			String[] arr=f1.list();
			File f2=new File(f1,"list.txt");
			if(f2.exists()==false) {
				f2.createNewFile();
			}
			PrintWriter ref=new PrintWriter(f2);
			for(int i=0;i<arr.length;i++) {
				ref.println(arr[i]);
			}
			ref.flush();
			ref.close();
		}
	}

}
