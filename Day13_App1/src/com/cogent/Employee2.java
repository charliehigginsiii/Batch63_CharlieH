package com.cogent;

import java.util.Objects;

public class Employee2 {
	private int empNo;
	private String empName;
	private double sal;
	public Employee2(int empNo, String empName, double sal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
	}
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empName, empNo, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		return Objects.equals(empName, other.empName) && empNo == other.empNo
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}
	public int compareTo(Employee2 o) {
		if(empNo==o.empNo)
		return 0;
		else if(empNo>o.empNo)
			return 1;
		else
			return -1;
	}
}
