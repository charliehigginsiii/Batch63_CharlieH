package com.cogent.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Manager227 {
	public static void main(String[]args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		Stream<Integer> stream3=list.stream();
		Integer[] evenNumberList=stream3.filter(i->i%2==0).toArray(Integer[]::new);
		//List<Integer> evenNumberList=stream3.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);
	}
}
