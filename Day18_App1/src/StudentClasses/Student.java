package StudentClasses;

import java.io.Serializable;

public class Student implements Serializable{
	int studentNumber;
	String studentName;
	String studentEmail;
	public Student(int studentNumber, String studentName, String studentEmail) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	

}
