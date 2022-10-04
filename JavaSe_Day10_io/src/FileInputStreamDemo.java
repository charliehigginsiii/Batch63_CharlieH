import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[]args) {
		File file=new File(args[0]);
		String s="Welcome to Cogent family and taking java full stack training";
		byte b[]=s.getBytes();
		/*for(int i=0;i<b.length;i++) {
			System.out.println((char)b[i]);
		}*/
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file);
			int ch;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
			System.out.println("File is read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
