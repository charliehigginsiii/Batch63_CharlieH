package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {
	public static void main(String[]args) {
		//Between late Java and java 8
		Set<String> list2=new HashSet<String>();
		
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

