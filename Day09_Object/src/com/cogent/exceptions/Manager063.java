package com.cogent.exceptions;

public class Manager063 {
	public static void main(String[]args) {
		System.out.println("main starts");
		
		try {
			System.out.println(Integer.parseInt(args[0]));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured and handled: Pls pass CLA");
		}catch(NumberFormatException nfe) {
			System.out.println("NumberFormatException occured and handled: Pls pass numeric value of CLA");
		}
		System.out.println("main ends");
	}
}
