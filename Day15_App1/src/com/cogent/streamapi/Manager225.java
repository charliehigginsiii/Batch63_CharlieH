package com.cogent.streamapi;

import java.util.Random;
import java.util.stream.Stream;

public class Manager225 {
	public static void main(String[]args) {
		Stream<Integer> rn=Stream.generate(()->(new Random()).nextInt(100));
		rn.limit(20).forEach(p->System.out.println(p));
		rn.limit(100).forEach(System.out::println);
	}
}
