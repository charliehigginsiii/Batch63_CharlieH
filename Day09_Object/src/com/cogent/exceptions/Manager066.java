package com.cogent.exceptions;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 29, 2022
 */
public class Manager066 {
	public static void main(String[]args) {
		System.out.println(new Manager066().test(100));
	}
	int test(int i) {
		try {
			int j=100/i-10;
			return j;
		}catch(Exception  e) {
			return 100;
		}
	}
}
