package com.cogent.exceptions;

public class Manager064 {
	public static void main(String[]args) {
		System.out.println("main starts");
		try {
			System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		}catch(ArrayIndexOutOfBoundsException aioobee) {
			System.out.println("ArrayIndexOutOfBoundsException occured and handled: Pls pass CLA");
			aioobee.printStackTrace();
		}catch(NumberFormatException nfe) {
			System.out.println("NumberFormatException");
			nfe.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception Occured & handled");
		}
		System.out.println("main ends");
	}

}
