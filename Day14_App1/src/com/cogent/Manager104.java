package com.cogent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Manager104 {
	public static void main(String[]args) {
		List<Employee> list=new ArrayList();
		list.add(new Employee(101,"Raman",1000));
		list.add(new Employee(102,"Raman",1000));
		list.add(new Employee(103,"Raman",1000));
		list.add(new Employee(104,"Raman1",1000));
		list.add(new Employee(105,"Raman1",1000));
		
		Predicate<Employee> e =new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				System.out.println(t);
				return false;
			}
			
		};
 		//Function<Employee,Employee> f=new Function<Employee,Employee>();
		Consumer<Employee> c=new Consumer<Employee>() {
	
			@Override
			public void accept(Employee t) {
				System.out.println(t);
				
			}
			
		};
		list.forEach(c);
		list.forEach(
				(n)->System.out.println(n)
				);
	}
}
