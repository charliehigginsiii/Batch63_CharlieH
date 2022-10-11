package com.cogent;

public class Manager067 {
	public static void main(String[]args) {
		try {
			int i=Integer.parseInt(args[0]);
			System.out.println(i/(i-10));
			System.out.println("I am from try block");
			try {
				
			}catch(Exception e){
				
			}
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			try {
				
			}catch(Exception ex) {
				
			}
			System.out.println("I am from catch block");
		}finally {
			try {
				
			}catch(Exception e) {
				
			}
			System.out.println("I am from finally block");
		}
		System.out.println("I am at end of main method");
	}
}
