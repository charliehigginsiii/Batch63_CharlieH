package com.bean;

public class Employee2 extends Employee {
	private int empNo;
	private String empName;
	private double salary;
	private String email;
	public Employee2(int empNo,String empName,double salary, String email) {
		super();
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		this.email=email;
	}
	public void display() {
		System.out.println("Employee number: "+empNo+" | "+"Employee name: "+empName+" | "+
				"Employee Salary: "+salary+" | "+"Employee email: "+email+" | ");
	}
}
