package com.cogent.exceptions;

public class Manager062 {
	public static void main(String[]args) {
		System.out.println("main starts");
		
		try {
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("ArrayIndexOutOfBoundsException occured and handles");
			System.out.println("Please pass command line argument");
		}
		
		
		
		System.out.println("main ends");
	}
}
