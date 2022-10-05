package com.cogent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Manager100 {
	public static void main(String[]args) {
		List<String> list=new ArrayList<>();
		list.add("Jan");
		list.add("Feb");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("Jun");
		list.add("Jul");
		list.add("Aug");
		list.add("Sep");
		list.add("Oct");
		list.add("Nov");
		list.add("Dec");
		System.out.println(list);
		System.out.println(list.size());
		for(String str:list) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println();
		Object[] st=list.toArray();
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].toString());
		}
		System.out.println();
		Set<String> list1=new HashSet<>(list);
		for(String month:list1) {
			System.out.println(month);
		}
	}
}
