package Com.jspider.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int eid;
    double ctc;//transient key word is used to ignore the serialization
}
public class Mainclass12  {
	public static void main(String[] args) throws IOException {
		Employee emp=new Employee();
		emp.eid=101;
		emp.ctc=4.5;
		FileOutputStream fos=new FileOutputStream("C:/FILEIO/repository.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		
	}
}
