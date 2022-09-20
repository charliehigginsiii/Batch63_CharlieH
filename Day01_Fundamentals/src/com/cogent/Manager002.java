package com.cogent;

class Person{
	String name;
	int age;
	double weight;
	public void setName(String thename) {
		name=thename;
	}
	public void setAge(int theage) {
		age=theage;
	}
	public void setWeight(double theweight) {
		weight=theweight;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
}
public class Manager002 extends Person {
	public static void main(String[]args) {
		Person obj=new Person();
		obj.setName("Charlie");
		obj.setAge(24);
		obj.setWeight(240.0);
		obj.name="Charlie";
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getWeight());
		
	}

}
