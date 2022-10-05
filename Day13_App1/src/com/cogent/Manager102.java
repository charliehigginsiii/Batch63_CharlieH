package com.cogent;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Manager102 {
	public static void main(String[]args) {
		System.out.println();
		Set<Employee> employees=new TreeSet<>();
		employees.add(new Employee(101,"Charlie1",1000));
		employees.add(new Employee(102,"Charlie2",2000));
		employees.add(new Employee(103,"Charlie3",3000));
		employees.add(new Employee(104,"Charlie4",4000));
		employees.add(new Employee(105,"Charlie5",5000));
		employees.add(new Employee(101,"Charlie1",1000));
		employees.add(new Employee(102,"Charlie2",2000));
		employees.add(new Employee(103,"Charlie3",3000));
		employees.add(new Employee(104,"Charlie4",4000));
		employees.add(new Employee(105,"Charlie5",5000));
		for(Employee emp:employees) {
			System.out.println(emp);
		}
	}
}
