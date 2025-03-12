package Com.jspider.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Activity2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:/FILEIO/A.txt"));
		PrintWriter pw=new PrintWriter("C:/FILEIO/C.txt");
		String line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("C:/FILEIO/B.txt"));
		line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		br.close();
		pw.close();
		
	}

}
