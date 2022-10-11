package com.cogent;

import java.util.ArrayList;
import java.util.List;

public class Manager123 {
	public static void main(String[]args) {
		List<String> list=new ArrayList<>();
		list.add("VADIM");
		list.add("Rijo");
		list.add("Gregg");
		
		for(String s: list) {
			System.out.println(s);
		}
		list.forEach(
				(n)->System.out.println());
	}
}
