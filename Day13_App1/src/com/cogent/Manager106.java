package com.cogent;

import java.util.Stack;

public class Manager106 {
	public static void main(String[]args) {
		Stack<Integer> st=new Stack<>();
		if(st.isEmpty())
		System.out.println("Stack is Underflow");
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		st.push(600);
		st.push(700);
		st.push(800);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
	}
}
