package com.app.client;

import com.bean.Employee2;

public class EmployeeClient2 {
	public static void main(String[]args) {
		Employee2 e1=new Employee2(100,"Raju",1000,"raju@gmail.com");
		Employee2 e2=new Employee2(101,"Raju",1000,"raju@gmail.com");
		Employee2 e3=new Employee2(102,"Raju",1000,"raju@gmail.com");
		Employee2 e4=new Employee2(103,"Raju",1000,"raju@gmail.com");
		Employee2 e5=new Employee2(104,"Raju",1000,"raju@gmail.com");
		Employee2 e6=new Employee2(105,"Raju",1000,"raju@gmail.com");
		Employee2 e7=new Employee2(106,"Raju",1000,"raju@gmail.com");
		Employee2 e8=new Employee2(107,"Raju",1000,"raju@gmail.com");
		Employee2 e9=new Employee2(108,"Raju",1000,"raju@gmail.com");
		Employee2 e10=new Employee2(109,"Raju",1000,"raju@gmail.com");
		Employee2[] EmployeeArray=new Employee2 [10];
		EmployeeArray[0]=e1;
		EmployeeArray[1]=e2;
		EmployeeArray[2]=e3;
		EmployeeArray[3]=e4;
		EmployeeArray[4]=e5;
		EmployeeArray[5]=e6;
		EmployeeArray[6]=e7;
		EmployeeArray[7]=e8;
		EmployeeArray[8]=e9;
		EmployeeArray[9]=e10;
		for(int i=0;i<EmployeeArray.length;i++) {
			EmployeeArray[i].display();
		}
		
		e1.display();
	}
}
