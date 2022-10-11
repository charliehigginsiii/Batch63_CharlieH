package com.cogent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
public class DataStructures {
	public static void main(String[]args) {
		//Lists
		System.out.println("ArrayList-------------------------------------------------");
		ArrayList<Integer> Arrlist=new ArrayList<>();
		Arrlist.add(1);
		Arrlist.add(5);
		Arrlist.add(2);
		Arrlist.add(3);
		System.out.println(Arrlist);
		Arrlist.remove(3);
		System.out.println(Arrlist);
		System.out.println();
		System.out.println("LinkedList-------------------------------------------------");
		LinkedList<Integer> Linkedlist=new LinkedList<>();
		Linkedlist.add(10);
		Linkedlist.add(52);
		Linkedlist.add(27);
		Linkedlist.add(33);
		System.out.println(Linkedlist);
		Linkedlist.remove(0);
		System.out.println(Linkedlist);
		System.out.println();
		System.out.println("Vector-------------------------------------------------");
		Vector<Integer> vector=new Vector<>();
		System.out.println("Vector Size: "+vector.size());
		vector.add(10);
		System.out.println("Vector Size: "+vector.size());
		vector.add(52);
		System.out.println("Vector Size: "+vector.size());
		vector.add(27);
		vector.add(33);
		System.out.println("Vector: "+vector);
		vector.remove(0);
		System.out.println("Vector: "+vector);
		System.out.println();
		System.out.println("Stack-------------------------------------------------");
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(52);
		stack.push(27);
		stack.push(33);
		System.out.println("Stack: "+stack);
		System.out.println("Peek: "+stack.peek());
		stack.pop();
		System.out.println("Stack: "+stack);
		System.out.println("Peek: "+stack.peek());
		System.out.println();
		
		//Sets
		System.out.println("Hashset----------------------------------------------");
		HashSet<String> hashset=new HashSet<>();
		hashset.add("India");
		hashset.add("Kenya");
		hashset.add("Brazil");
		hashset.add("United States");
		hashset.add("India");
		System.out.println(hashset);
		System.out.println("LinkedHashset----------------------------------------------");
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
		linkedhashset.add("Iran");
		linkedhashset.add("Tanzania");
		linkedhashset.add("Argentina");
		linkedhashset.add("United Kingdom");
		linkedhashset.add("Iran");
		System.out.println(linkedhashset);
	}
	
	
	
}
