package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 27, 2022
 */
abstract class Person046{
	final void test() {
		System.out.println("Hello");
	}
	 	//final abstract void running();
}
class Student046 extends Person046{
	
}
public class Manager046 {
	public static void main(String[]args) {
		Student046 stu=new Student046();
		stu.test();
	}
}
