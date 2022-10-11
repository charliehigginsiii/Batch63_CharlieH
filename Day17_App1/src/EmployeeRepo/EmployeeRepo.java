package EmployeeRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public interface EmployeeRepo {
	public void insertEmployee();
	public void updateEmployee() ;
	public void deleteEmployee() ;
	public String findEmployeeById();
	public String findEmployeeByName();
	public String findEmployeeByemail();
}
