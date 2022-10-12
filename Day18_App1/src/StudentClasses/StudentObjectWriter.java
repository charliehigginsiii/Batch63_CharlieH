package StudentClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class StudentObjectWriter {
	public static void main(String[]args) {
		Properties prop=new Properties();
		ArrayList<Student> students=new ArrayList();
		StudentObjectWriter obj=new StudentObjectWriter();
		Class classobj=obj.getClass();
		URL filepath=classobj.getResource("StudentObject.txt");
		URL filepath1=classobj.getResource("test.properties");
		try {
			FileInputStream input=new FileInputStream(filepath1.getFile());
			prop.load(input);
			input.close();
			Class.forName(prop.getProperty("jdbc.driver"));
			Connection con=DriverManager.getConnection(prop.getProperty("jdbc.url"),prop.getProperty("jdbc.username"),prop.getProperty("jdbc.password"));
			Statement select=con.createStatement();
			ResultSet rs=select.executeQuery("select * from students");
			while(rs.next()) {
				students.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			FileOutputStream fileoutput=new FileOutputStream(filepath.getFile());
			ObjectOutputStream writeObj=new ObjectOutputStream(fileoutput);
			for(int i=0;i<students.size();i++) {
				writeObj.writeObject("Student[stNo= "+students.get(i).getStudentNumber()+", stName= "+students.get(i).getStudentName()+", stEmail= "+students.get(i).getStudentName()+"]\n");
			}
			System.out.println(students);
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
