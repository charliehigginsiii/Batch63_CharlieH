package com.cogent;

import java.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

public class Manager220 {
	public static void main(String[]args) {
		//Type 3 Method
		
		/*Function<Integer,String> r=new Function<Integer,String>(){
			@Override
			public String apply(Integer t) {
				return t*10+"Display data of 10";
			}
		};
		r.apply(5);*/
		Function<Integer,String> result=t->t*10+" Display data of 10";
		System.out.println(result.apply(5));
	}
}
