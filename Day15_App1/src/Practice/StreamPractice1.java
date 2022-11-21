package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamPractice1 {
	public static void main(String[]args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(15);
		list.add(7);
		list.add(12);
		list.add(28);
		list.add(45);
		list.add(12);
		
		Stream<Integer> getElements=list.stream();
		Stream<Integer> getElements1=list.stream();
		getElements.filter(t->t==12).forEach(System.out::println);
		System.out.println();
		Integer[]arr=getElements1.filter(p->p%3==0).toArray(Integer[]::new);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		list.stream().filter(i->i%9==0).forEach(System.out::println);
		//list.stream().sorted().forEach(System.out::println);
		//list.stream().distinct().forEach(System.out::println);
		//list.stream().limit(4).forEach(System.out::println);
		//list.stream().skip(4).forEach(System.out::println);
		//list.stream().map(t->t*10).forEach(System.out::println);
		//list.stream().flatMap(null).forEach(System.out::println);
		//Boolean num=list.stream().allMatch(t->t>45);
		//System.out.println(num);
		//Integer num=list.stream().findAny().get();
		//System.out.println(num);
		System.out.println();
		Function<String,Integer> getPlace=new Function<String,Integer>(){
			@Override
			public Integer apply(String s) {
				int returnvalue=0;
				if(s.toLowerCase().equals("first")) {
					returnvalue=1;
				}else if(s.toLowerCase().equals("second")) {
					returnvalue=2;
				}else if(s.toLowerCase().equals("third")) {
					returnvalue=3;
				}else {
					return -0001;
				}
				return returnvalue;
			}
		};
		System.out.println(getPlace.apply("second"));
		
		Function<Integer,Integer> getNewNum=t->t*100;
		System.out.println(getNewNum.apply(30));
		
		Predicate<Integer> size=t->t>50;
		System.out.println(size.test(49));
		
		Supplier<String> giveFood=()->"Fried Chicken";
		System.out.println(giveFood.get());
		
		Consumer<Integer> getMeData=t->list.add(t);
		getMeData.accept(15);
		getMeData.accept(90);
		System.out.println(list);
		
		
		
	}

}
