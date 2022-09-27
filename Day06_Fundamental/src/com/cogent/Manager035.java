package com.cogent;

public class Manager035 {
	public static void main(String[]args) {
		byte b=10;
		int i=b; //Auto Widening
		
		long l=b;
		
		int k=10;
		byte b1=(byte)k; //Explicit Narrowing
	}
}
