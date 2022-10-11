package EmployeeClient;

import java.util.Scanner;

import EmployeeService.EmployeeServiceImpl;

public class EmployeeClient {
	public static void main(String[]args) {
		EmployeeServiceImpl operations=new EmployeeServiceImpl();
		boolean runprogram=true;
		while(runprogram) {
			System.out.println("Options: "
					+ "Option 1: Insert"+"\n"
					+ "Option 2: Update"+"\n"
					+ "Option 3: Delete"+"\n"
					+ "Option 4: Find By Id "+"\n"
					+ "Option 5: Find By name "+"\n"
					+ "Option 6: Find By email "+"\n"
					+ "Option 7: Exit ");
			int Option=new Scanner(System.in).nextInt();
			if(Option==1) {
				operations.insertEmployee();
			}else if(Option==2) {
				operations.updateEmployee();
			}else if(Option==3) {
				operations.deleteEmployee();
			}else if(Option==4) {
				System.out.println(operations.findEmployeeById());
			}else if(Option==5) {
				System.out.println(operations.findEmployeeByName());
			}else if(Option==6) {
				System.out.println(operations.findEmployeeByemail());
			}else if(Option==7) {
				runprogram=false;
			}
			
		}
	}
}
