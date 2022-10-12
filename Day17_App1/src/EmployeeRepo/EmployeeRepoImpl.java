package EmployeeRepo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeRepoImpl implements EmployeeRepo{
	public void insertEmployee() {
		try {
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			PreparedStatement insert=con.prepareStatement("insert into emp(empNo, empName, phone, empEmail,snn)values(?,?,?,?,?)");
			System.out.println("Enter Employee's Id: ");
			insert.setInt(1,new Scanner(System.in).nextInt());
			System.out.println("Enter Employee's Name: ");
			insert.setString(2,new Scanner(System.in).nextLine());
			System.out.println("Enter Employee's Phone Number: ");
			insert.setString(3,new Scanner(System.in).nextLine());
			System.out.println("Enter Employee's Email: ");
			insert.setString(4,new Scanner(System.in).nextLine());
			System.out.println("Enter Employee's Social Security: ");
			insert.setString(5,new Scanner(System.in).nextLine());
			int i=insert.executeUpdate();
			System.out.println("1 record had been added");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateEmployee() {
		try {
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			System.out.println("Options: "
					+ "Option 1: Change Name"+"\n"
					+ "Option 2: Change Phone"+"\n"
					+ "Option 3: Change Email"+"\n"
					+ "Option 4: Change SNN ");
			System.out.println("Enter Number");
			int option=new Scanner(System.in).nextInt();
			if(option==1) {
				PreparedStatement update=con.prepareStatement("update emp set empName=? where empNo=?");
				System.out.println("Enter new name: ");
				update.setString(1, new Scanner(System.in).nextLine());
				System.out.println("Enter the id of employee whose name you want to change: ");
				update.setInt(2, new Scanner(System.in).nextInt());
				int i=update.executeUpdate();
				System.out.println(i+" row has been updated");
			}else if(option==2) {
				PreparedStatement update=con.prepareStatement("update emp set phone=? where empNo=?");
				System.out.println("Enter new phone number: ");
				update.setString(1, new Scanner(System.in).nextLine());
				System.out.println("Enter the id of employee whose phone number you want to change: ");
				update.setInt(2, new Scanner(System.in).nextInt());
				int i=update.executeUpdate();
				System.out.println(i+" row has been updated");
			}else if(option==3) {
				PreparedStatement update=con.prepareStatement("update emp set empEmail=? where empNo=?");
				System.out.println("Enter new email: ");
				update.setString(1, new Scanner(System.in).nextLine());
				System.out.println("Enter the id of employee whose email you want to change: ");
				update.setInt(2, new Scanner(System.in).nextInt());
				int i=update.executeUpdate();
				System.out.println(i+" row has been updated");
			}else if(option==4) {
				PreparedStatement update=con.prepareStatement("update emp set snn=? where empNo=?");
				System.out.println("Enter new snn: ");
				update.setString(1, new Scanner(System.in).nextLine());
				System.out.println("Enter the id of employee whose snn you want to change: ");
				update.setInt(2, new Scanner(System.in).nextInt());
				int i=update.executeUpdate();
				System.out.println(i+" row has been updated");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteEmployee() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			PreparedStatement delete=con.prepareStatement("delete from emp where empNo=?");
			System.out.println("Enter Employee Id: ");
			delete.setString(1, Integer.toString(new Scanner(System.in).nextInt()));
			int i=delete.executeUpdate();
			System.out.println(i+" record has been deleted.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String findEmployeeById() {
		String employee="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			System.out.println("Enter Employee's id: ");
			PreparedStatement query=con.prepareStatement("select * from emp where empNo=?");
			query.setString(1, new Scanner(System.in).nextLine());
			ResultSet result=query.executeQuery();
			if(result==null) {
				employee="The Employee does not exists.";
			}else {
				result.next();
				employee=result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	public String findEmployeeByName() {
		String employee="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			System.out.println("Enter Employee's Name: ");
			PreparedStatement query=con.prepareStatement("select * from emp where empName=?");
			query.setString(1, new Scanner(System.in).nextLine());
			ResultSet result=query.executeQuery();
			if(result==null) {	
				employee="The Employee does not exists.";
			}else {
				result.next();
				employee=result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	public String findEmployeeByemail() {
		String employee="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			System.out.println("Enter Employee's Email: ");
			PreparedStatement query=con.prepareStatement("select * from emp where empEmail=?");
			query.setString(1, new Scanner(System.in).nextLine());
			ResultSet result=query.executeQuery();
			if(result==null) {
				employee="The Employee does not exists.";
			}else {
				result.next();
				employee=result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	
}
