package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class JdbcExample1 {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			Statement s=con.createStatement();
			PreparedStatement psmt=con.prepareStatement("insert into student values(?,?,?,?)");
			psmt.setInt(1, 109);
			psmt.setString(2, "abcd");
			psmt.setString(3, "abcd@gmail.com");
			psmt.setString(4, "09876876");
			int i=psmt.executeUpdate();
			System.out.println(i+" Records are inserted");
			ResultSet rs=s.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
