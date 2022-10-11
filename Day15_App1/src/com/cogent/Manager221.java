package com.cogent;

import java.util.function.Predicate;

public class Manager221 {
	public static void main(String[]args) {
		Predicate<String> c=new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length()>5;
			}
		};
		System.out.println(c.test("Welcome"));
		//Predicate<String> checkLength=str->str.length()>5;
		//System.out.println(checkLength.test("Welcome"));
	}
}
