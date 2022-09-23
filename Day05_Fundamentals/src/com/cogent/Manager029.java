package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 23, 2022
 */
class Passport{
	String name;
	int age;
	String email;
	String nationality;
	public Passport(String name,int age,String email,String nationality) {
		super();
		this.name=name;
		this.age=age;
		this.email=email;
		this.nationality=nationality;
	}
}
public class Manager029 {
	
	public static void main(String[] args) {
		Passport p1=new Passport("Charlie",24,"cgmail.com","U.S");
		Passport p2=new Passport("John",50,"afdsfsas","U.S");
		System.out.println(p2.age);

	}

}
