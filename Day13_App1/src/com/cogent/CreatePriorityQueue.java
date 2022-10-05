package com.cogent;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class CreatePriorityQueue {
	public static void main(String[]args) {
		PriorityQueue<Integer> pq=new PriorityQueue();
		pq.add(10);
		pq.add(50);
		pq.add(5);
		pq.add(15);
		System.out.println("Number Queue: "+pq);
		System.out.println("Head of Queue: "+pq.peek());
		System.out.println(pq.offer(12));
		System.out.println("Number Queue: "+pq);
		System.out.println(pq.poll());
		System.out.println("Number Queue: "+pq);
		for(Integer emp: pq) {
			System.out.println(emp);
		}
		System.out.println("------------------------");
		
		PriorityQueue<Employee> employeequeue=new PriorityQueue();
		employeequeue.add(new Employee(101,"Charles",20000));
		employeequeue.add(new Employee(102,"Alex",25000));
		employeequeue.add(new Employee(103,"Mason",30000));
		employeequeue.add(new Employee(104,"Kristian",35000));
		employeequeue.add(new Employee(105,"Dalton",40000));
		System.out.println("Employees Queue: "+employeequeue);
		System.out.println("Head of Queue: "+employeequeue.peek());
		System.out.println(employeequeue.offer(new Employee(106,"Jack",45000)));
		System.out.println("Employees Queue: "+employeequeue);
		System.out.println(employeequeue.poll());
		System.out.println("Employees Queue: "+employeequeue);
		System.out.println(employeequeue.remove());
		System.out.println("Employees Queue: "+employeequeue);
		for(Employee emp: employeequeue) {
			System.out.println(emp);
		}
		System.out.println("------------------------");
		
		ArrayDeque<Integer> deque=new ArrayDeque();
		deque.add(10);
		deque.add(15);
		deque.add(16);
		deque.add(30);
		deque.add(18);
		deque.add(35);
		System.out.println("Number Deque: "+deque);
		System.out.println("Head of Deque: "+deque.getFirst());
		System.out.println("Last of Deque: "+deque.getLast());
		System.out.println("------------------------");
		
		ArrayDeque<Employee> employeesdeque=new ArrayDeque();
		employeesdeque.add(new Employee(101,"Charles",20000));
		employeesdeque.add(new Employee(102,"Alex",25000));
		employeesdeque.add(new Employee(103,"Mason",30000));
		employeesdeque.add(new Employee(104,"Kristian",35000));
		employeesdeque.add(new Employee(105,"Dalton",40000));
		System.out.println("Employees Deque: "+employeesdeque);
		System.out.println("Head of Deque: "+employeesdeque.getFirst());
		System.out.println("Last of Deque: "+employeesdeque.getLast());
		
		
	}

}
