package Com.jspider.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Mainclass13 {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:/FILEIO/repository.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp.eid);
		System.out.println(emp.ctc);
		ois.close();
		fis.close();
		
	}

}
