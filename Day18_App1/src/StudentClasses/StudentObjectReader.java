package StudentClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class StudentObjectReader {
	public static void main(String[]args) {
		StudentObjectReader obj=new StudentObjectReader();
		Class classobj=obj.getClass();
		URL filepath=classobj.getResource("StudentObject.txt");
		try {
			int string=0;
			FileInputStream fileinput=new FileInputStream(filepath.getFile());
			while((string=fileinput.read())!=-1) {
				System.out.print((char)string+" ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
