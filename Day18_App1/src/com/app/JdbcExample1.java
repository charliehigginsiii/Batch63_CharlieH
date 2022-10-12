package com.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcExample1 {
	public static void main(String[]args) {
		Properties prop=new Properties();
		try {
			FileInputStream input=new FileInputStream("C:/Users/Chuck/eclipse-workspace/Day18_App1/src/com/app/test.properties");
			prop.load(input);
			input.close();
			Class.forName(prop.getProperty("jdbc.driver"));
		} catch (ClassNotFoundException | IOException e1) {
			e1.printStackTrace();
		}try(
			Connection con=DriverManager.getConnection(prop.getProperty("jdbc.url"),prop.getProperty("jdbc.username"),prop.getProperty("jdbc.password")); 
			Statement st=con.createStatement(); ResultSet 
			rs=st.executeQuery("select * from employees");
		){
			ResultSetMetaData md=rs.getMetaData();
			int x=md.getColumnCount();
			for(int i=1;i<=x;i++) {
				System.out.print(md.getColumnName(i).toUpperCase()+"  ");
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=x;i++) {
					System.out.print(rs.getString(i)+"  ");
				}
				System.out.println();
			}
			System.out.println("Get Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
