package com.cogent;

import java.util.function.Consumer;

class Employee{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Manager223 {
	public static void main(String[]args) {
		Employee e=new Employee();
		Consumer<Employee> setName=t->t.setName("Charlie");
		setName.accept(e);
		System.out.println(e.getName());
	}

}
