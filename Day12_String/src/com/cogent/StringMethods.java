package com.cogent;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[]args) {
		String s="Cogent University";
		String s1="cogent university";
		String s2="           cogent university";
		String q="";
		System.out.println(s.charAt(1));
		System.out.println(s.length());
		System.out.println(String.format("Hello this is %s","Charlie"));
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,5));
		System.out.println(s.contains("College"));
		System.out.println(q.isEmpty());
		System.out.println(s.concat("Hello"));
		System.out.println(s.replace('C', 'l'));
		System.out.println(s.replace("Cogent","Columbia"));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(Arrays.toString(s.split(" ")));
		System.out.println(Arrays.toString(s.split("",2)));
		System.out.println(s.intern());
		System.out.println(s.indexOf("g"));
		System.out.println(s.indexOf("n",5));
		System.out.println(s.indexOf("gent"));
		System.out.println(s.indexOf("sity",5));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s2.trim());
		System.out.println(String.valueOf(15));
		
		
		
	}

}
