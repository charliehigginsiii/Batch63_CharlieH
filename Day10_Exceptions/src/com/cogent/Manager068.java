package com.cogent;

public class Manager068 {
	public static void main(String[]args) {
		try {
			int i=10;
			System.exit(0);
		}catch(NumberFormatException ae){
			ae.printStackTrace();
		}finally {
			System.out.println("Manadatory task");
		}
	}
}
