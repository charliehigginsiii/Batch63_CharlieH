package com.cogent;
import java.util.ArrayList;
import java.util.Collections;
public class JavaCollections {
	public static void main(String[]args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(15);
		list.add(16);
		Collections.addAll(list, 17, 18);
		System.out.println(Collections.binarySearch(list, 17));
		System.out.println(list);
	}

}
