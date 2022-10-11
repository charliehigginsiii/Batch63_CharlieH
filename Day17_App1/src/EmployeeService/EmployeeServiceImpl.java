package EmployeeService;

import EmployeeRepo.EmployeeRepo;
import EmployeeRepo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo database=new EmployeeRepoImpl();

	@Override
	public void insertEmployee() {
		database.insertEmployee();
		
	}

	@Override
	public void updateEmployee() {
		database.updateEmployee();
		
	}

	@Override
	public void deleteEmployee() {
		database.deleteEmployee();
		
	}

	@Override
	public String findEmployeeById() {
		String employee=database.findEmployeeById();
		return employee;
	}

	@Override
	public String findEmployeeByName() {
		String employee=database.findEmployeeByName();
		return employee;
	}

	@Override
	public String findEmployeeByemail() {
		String employee=database.findEmployeeByemail();
		return employee;
	}
	

}
