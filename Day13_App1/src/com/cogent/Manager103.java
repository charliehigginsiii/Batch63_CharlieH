package com.cogent;

import java.util.TreeSet;
import java.util.Set;
import java.util.Comparator;

public class Manager103 {
	public static void main(String[]args) {
		EmpnoComparator ec=new EmpnoComparator();
		Set<Employee2> employees=new TreeSet<Employee2>(ec);
		employees.add(new Employee2(101,"Charlie1",1000));
		employees.add(new Employee2(102,"Charlie2",2000));
		employees.add(new Employee2(103,"Charlie3",3000));
		employees.add(new Employee2(104,"Charlie4",4000));
		employees.add(new Employee2(105,"Charlie5",5000));
		employees.add(new Employee2(101,"Charlie1",1000));
		employees.add(new Employee2(102,"Charlie2",2000));
		employees.add(new Employee2(103,"Charlie3",3000));
		employees.add(new Employee2(104,"Charlie4",4000));
		employees.add(new Employee2(105,"Charlie5",5000));
		for(Employee2 employee:employees) {
			System.out.println(employee);
		}
		
		/*Set<Employee> employees=new TreeSet<Employee>(ec);
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
		for(Employee employee:employees) {
			System.out.println(employee);
		}*/
	}
}
