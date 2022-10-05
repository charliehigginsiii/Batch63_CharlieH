package com.cogent;

import java.util.Stack;

public class Manager107 {
	public static void main(String[]args) {
		Stack<Employee> st=new Stack<>();
		if(st.isEmpty())
		System.out.println("Stack is Underflow");
		st.push(new Employee(101,"John",1000));
		st.push(new Employee(102,"John",1000));
		st.push(new Employee(103,"John",1000));
		st.push(new Employee(104,"John",1000));
		st.push(new Employee(105,"John",1000));
		st.push(new Employee(106,"John",1000));
		st.push(new Employee(107,"John",1000));
		st.push(new Employee(108,"John",1000));
		for(Employee emp:st) {
			System.out.println(emp);
		}
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
	}
}
