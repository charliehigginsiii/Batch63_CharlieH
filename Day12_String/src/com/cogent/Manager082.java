package com.cogent;

import java.util.ArrayList;
import java.util.HashSet;

public class Manager082 {
	public static void main(String[]args) {
		String s1=" a";
		System.out.println(s1.length());
		//s1=s1.trim();
		System.out.println(s1);
		
		ArrayList list=new ArrayList();
		list.add(400);
		list.add(100);
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(200);
		list.add(200);
		list.add(400);
		System.out.println(list);
		HashSet set=new HashSet(list);
		System.out.println(set);
	}
}
