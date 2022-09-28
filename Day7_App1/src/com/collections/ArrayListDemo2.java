package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[]args) {
		//ArrayList<Integer> var=new ArrayList<>();
		List<Integer> var=new ArrayList<>();
		//Autoboxing and unboxing
		var.add(100);
		var.add(100);
		var.add(100);
		var.add(100);
		var.add(100);
		
		for(Integer i:var) {
			System.out.println(i);
		}
	}
}
