package com.cogent;

import java.util.function.Supplier;
public class Manager222 {
	public static void main(String[]args) {
		Supplier<Integer> len=()->new String("Charlie").length();
		System.out.println(len.get());
		
		Supplier<String> len1=()->new String("Charlie");
		System.out.println(len1.get());
	}
}
