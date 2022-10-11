package com.cogent.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Manager224 {
	public static void main(String[]args) {
		Stream<Integer> stream=Stream.of(34,34,45,64,23,45,56);
		stream.forEach(p->System.out.println(p));
		
		Stream<String> stream1=Stream.of("ramana","john","gregory");
		stream1.forEach(p->System.out.println(p));
		
		Integer[] arr=new Integer[] {1,2,3,4,5,6,7,8,9,10};
		Stream<Integer> stream2=Stream.of(arr);
		stream2.forEach(p->System.out.println(p));
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i*10);
		}
		
		Stream<Integer> stream3=list.stream();
		stream3.forEach(p->System.out.println(p));
	}
}
