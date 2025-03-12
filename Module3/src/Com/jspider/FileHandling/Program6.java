package Com.jspider.FileHandling;

import java.io.File;

public class Program6 {
	public static void main(String[] args) {
		File ref=new File("C:/FILEIO");
		boolean flag=ref.exists();
		if(flag==true) {
			String[] arr=ref.list();
			for(int i=0;i<arr.length;i++) {
				File obj=new File(ref,arr[i]);
				if(obj.isDirectory()==true) {
					System.out.println(arr[i]);
				}
			}
		}
		else {
			System.out.println("invalid location");
		}
	}

}
