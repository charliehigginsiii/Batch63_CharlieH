package com.cogent;

class Person059{
	String name;
	int age;
	public Person059(String name,int age) {
		super();
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+", "+age;
	}
}
public class Manager059 {
	public static void main(String[]args) {
		Person059 pl=new Person059("John",20);
		System.out.println(pl);
		System.out.println(pl.toString());
	}
}
