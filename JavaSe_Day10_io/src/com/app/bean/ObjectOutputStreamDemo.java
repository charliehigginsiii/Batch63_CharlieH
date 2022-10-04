package com.app.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[]args) {
	Employee e=new Employee(101,"Charlie",1000.0);
	e.setYSal(e.getSal());
	File file=new File("object.txt");
	try {
	FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e);
	System.out.println("Object is place in the file");
	System.out.println(e.display());
	}catch(FileNotFoundException f) {
		f.printStackTrace();
	}catch(IOException e1) {
		e1.printStackTrace();
	}
	}
}
