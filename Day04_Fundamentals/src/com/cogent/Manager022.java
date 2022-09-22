package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
class Person022{
	String name;
	int age;
	String pemail;
	String semail;
	public Person022() {
	}
	public Person022(String name, int age, String pemail) {
		super();
		this.name = name;
		this.age = age;
		this.pemail = pemail;
	}
	public Person022(String name, int age, String pemail, String semail) {
		super();
		this.name = name;
		this.age = age;
		this.pemail = pemail;
		this.semail = semail;
	}
	
}
public class Manager022 {
	public static void main(String[]args) {
		Person022 p1=new Person022();
		Person022 p2=new Person022("Mark",100,"mark@gmail.com");
		Person022 p3=new Person022("Ryan",200,"rayan@gmail.com","r@gmail.com");
		System.out.println(p1.name+" "+p1.age+" "+p1.pemail+" "+p1.semail);
		System.out.println(p2.name+" "+p2.age+" "+p2.pemail+" "+p2.semail);
		System.out.println(p3.name+" "+p3.age+" "+p3.pemail+" "+p3.semail);
	}
}
