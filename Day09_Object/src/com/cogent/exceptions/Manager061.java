package com.cogent.exceptions;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 29, 2022
 */
public class Manager061 {
	public static void main(String[]args) {
		System.out.println("main starts");
		// Command Line Argument
		try {
			System.out.println(args[0]);
		}catch(Exception e) {
			
		}
		
		System.out.println("main ends");
		/*
		 * java Manager061 10 20 30
		 * 
		 */
	}
}
