package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
class Person018 {
	String name;
	int age;
	double weight;
	Person018(String name, int age, double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
}
public class Manager018 {
	Person018 p1=new Person018("Charlie",24,220);
}
