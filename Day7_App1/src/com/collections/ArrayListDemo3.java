package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
	public static void main(String[]args) {
		Employee e1=new Employee(1,"Charlie",54000.0);
		Employee e2=new Employee(2,"Mark",60000.0);
		Employee e3=new Employee(3,"Jack",51000.0);
		Employee e4=new Employee(4,"Joe",48000.0);
		Employee e5=new Employee(5,"Alex",49000.0);
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		for(Employee e: list) {
			System.out.println(e.display());
		}
	}
}
