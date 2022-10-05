package com.cogent;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Manager105 {
	public static void main(String[]args) {
		//HashMap<Integer,String> hm=new HashMap<>();
		//Hashtable<Integer,String> hm=new Hashtable<>();
		TreeMap<Integer,String> hm=new TreeMap<>();
		hm.put(101, "Vadim");
		hm.put(102, "Vadim");
		hm.put(103, "Vadim");
		hm.put(104, "Vadim");
		hm.put(105, "Vadim");
		hm.put(106, "Vadim");
		hm.put(107, null);
		hm.put(108, null);
		System.out.println(hm);
		
	}

}
