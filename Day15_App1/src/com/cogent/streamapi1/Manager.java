package com.cogent.streamapi1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
	public static void main(String[]args) {
		List<String> s=new ArrayList<>();
		s.add("Jan");
		s.add("Feb");
		s.add("Mar");
		s.add("Apr");
		s.add("May");
		s.add("Jun");
		s.add("Jul");
		s.add("Aug");
		s.add("Sep");
		s.add("Oct");
		s.add("Nov");
		s.add("Dec");
		
		System.out.println(s.stream().filter(x->x.isEmpty()).count());
		System.out.println(s.stream().anyMatch(t->t.startsWith("A")));
		System.out.println(s.stream().allMatch(t->t.startsWith("A")));
		System.out.println(s.stream().noneMatch(t->t.startsWith("A")));
		
		s.stream().filter(t->t.startsWith("J")).forEach(System.out::println);
		System.out.println("--------------------------");
		s.stream().filter(t->t.startsWith("J")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println("--------------------------");
		s.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		List<String> list=s.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list);
	}
}
