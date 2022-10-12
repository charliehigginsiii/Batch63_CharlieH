package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample_Finally {
	public static void main(String[]args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			st=con.createStatement();
			rs=st.executeQuery("select * from employees");
			while(rs.next()) {
				System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				System.out.println();
			}
			System.out.println("Get Connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
