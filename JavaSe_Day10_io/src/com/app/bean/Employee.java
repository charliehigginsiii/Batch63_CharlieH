package com.app.bean;

import java.io.Serializable;

public class Employee implements Serializable {
	public int empNo;
	private String empName;
	private double sal;
	transient private double ysal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empNo, String empName, double sal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
		this.ysal=ysal*12;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getYSal() {
		return ysal;
	}
	public void setYSal(double ysal) {
		this.ysal = ysal;
	}
	public String display() {
		return "Employee Name: "+getEmpName()+" Employee Number: "+getEmpNo()+" Salary: $"+getSal()
		+" Yearly Salary: $"+this.ysal;
	}
	
}
