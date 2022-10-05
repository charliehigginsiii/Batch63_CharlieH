package com.cogent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Manager108 {
	public static void main(String[]args) {
		File f=new File("C:\\Users\\Chuck\\git\\Batch63_CharlieH\\Day13_App1\\src\\com\\cogent\\jdbc.properties");
		try {
			FileInputStream fis=new FileInputStream(f);
			Properties prop=new Properties();
			prop.load(fis);
			System.out.println("Driver:- "+prop.getProperty("Driver"));
			System.out.println("URL:- "+prop.getProperty("url"));
			System.out.println("Username:- "+prop.getProperty("uname"));
			System.out.println("Password:- "+prop.getProperty("pswd"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
