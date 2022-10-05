package com.cogent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Manager101 {
	public static void main(String[]args) {
		List<Employee> employees=new ArrayList<>();
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
		System.out.println();
		Set<Employee> employeesset=new HashSet<>(employees);
		for(Employee emp:employeesset) {
			System.out.println(emp);
		}
	}
}
