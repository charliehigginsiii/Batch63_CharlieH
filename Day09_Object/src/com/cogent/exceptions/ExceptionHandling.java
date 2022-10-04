package com.cogent.exceptions;

public class ExceptionHandling {
	public static void main(String[]args) throws ArithmeticException{
		try {
			int i=5/0;
			System.out.println(i);
		}catch(ArithmeticException e){
			System.out.println("Can't divide by zero");
			e.printStackTrace();
		}
	}
}
