package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[]args) {
		//Before Java 5
		ArrayList list=new ArrayList();
		//Between Java 5-7
		ArrayList<String> list1=new ArrayList<String>();
		//Between late Java and java 8
		ArrayList<String> list2=new ArrayList<>();
		
		list2.add("India");
		list2.add("USA");
		list2.add("UK");
		list2.add("AUS");
		list2.add("NZ");
		list2.add("India");
		list2.add("USA");
		list2.add("UK");
		list2.add("AUS");
		list2.add("NZ");
		Iterator<String> i=list2.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		/*for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}*/
		System.out.println();
		for(String s:list2) {
			System.out.print(s+" ");
		}
		
	}
}
