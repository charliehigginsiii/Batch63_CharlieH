package com.cogent;


import java.util.Objects;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 29, 2022
 */
class Doctor{
	private int drId;
	private String drName;
	private double drSalary;
	private String drSpec;
	public Doctor(int drId, String drName,double drSalary,String drSpec) {
		this.drId=drId;
		this.drName=drName;
		this.drSalary=drSalary;
		this.drSpec=drSpec;
	}
	@Override
	public int hashCode() {
		return Objects.hash(drId, drName, drSalary, drSpec);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Doctor) {
			Doctor Doc=(Doctor)obj;
			if(Doc.drId==drId&&Doc.drName.contentEquals(drName)
					&&Doc.drSalary==drSalary&&Doc.drSpec.contentEquals(drSpec)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Id: "+drId+", Name: "+drName+", Salary: $"+drSalary+", Speciality: "+drSpec;
	}
	
}
public class Manager {
	public static void main(String[]args) {
	Doctor d1=new Doctor(1,"Jacob Jackson",61000.0,"Neurology");
	Doctor d2=new Doctor(1,"Jacob Jackson",61000.0,"Neurology");
		System.out.println(d1.equals(d2));
		System.out.println(d1.toString());
	}

}
