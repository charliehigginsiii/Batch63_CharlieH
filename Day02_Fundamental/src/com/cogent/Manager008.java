package com.cogent;

class Person008{
	static void display() {
		System.out.println("Java");
	}
	public void show() {
		System.out.println("Java");
	}
}

public class Manager008 {
	public static void main(String[]args) {
		new Person008().show();
		Person008.display();
		new Manager008().display();
		
	}
	public void display() {
		show();
	}
	static void show() {
		new Manager008().myname();
	}
	void myname() {
		System.out.println("Charlie Higgins");
	}
}
