package com.app.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[]args) {
	File f=new File("C:\\Users\\Chuck\\eclipse-workspace\\JavaSe_Day10_io\\object.txt");
	try {
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		Employee e=(Employee)o;
		System.out.println(e);
	}catch(FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	} catch (ClassNotFoundException e1) {
		e1.printStackTrace();
	}
	}
}
