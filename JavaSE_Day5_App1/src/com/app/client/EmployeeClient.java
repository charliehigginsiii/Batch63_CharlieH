package com.app.client;

import com.bean.Employee;

public class EmployeeClient {
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.setEmpNo(234);
		e1.setEmpName("Alex");
		e1.setSalary(30000);
		e1.setEmail("alex@gmail.com");
		System.out.println(e1.getEmpNo()+" | "+e1.getEmpName()+" | "+e1.getSalary()+" | "+e1.getEmail());
		Employee e2=new Employee();
		e2.setEmpNo(331);
		e2.setEmpName("James");
		e2.setSalary(55000);
		e2.setEmail("james@gmail.com");
		System.out.println(e2.getEmpNo()+" | "+e2.getEmpName()+" | "+e2.getSalary()+" | "+e2.getEmail());
	}

}
