package com.app.fin;
class A{
	final int MAX=100;
	int a=10;
	static int b=100;
	A(){
		
	}
	//final method
	public void show() {
		System.out.println("Show method from Class A");
	}
	//Instance method
	void display1() {
		System.out.println("this is static method");
	}
	//Static method
	static void display() {
		System.out.println("Thus us statuc netid");
	}
	//abstract methods
	//default methods
}
/*final class B extends A{
	@Override
	public void show() {
		System.out.println("Show method from Class B");
	}
}
class C extends B{
	@Override
	public void show() {
		System.out.println("Show method from class C");
	}
}*/

public class Sample {
	final int MAX=100;
	public static void main(String[]args) {
		System.out.println(new Sample().MAX);
	}

}
