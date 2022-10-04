import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[]args) {
		File file=new File("Data.txt");
		String s="Welcome to Cogent family and taking java full stack training";
		byte b[]=s.getBytes();
		/*for(int i=0;i<b.length;i++) {
			System.out.println((char)b[i]);
		}*/
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
			fos.write(b);
			System.out.println("File is created amd added some data");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
