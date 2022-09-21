package com.cogent;
class GrandFather013{
	void walk() {
		System.out.println("Walking");
	}
}
class Father013 extends GrandFather013{
	/*void fatherwalking() {
		new Father013().walk();
	}*/
	void drive() {
		System.out.println("Drive Car");
	}
}
class Son013 extends Father013{
	/*void sonwalking() {
		new Son013().fatherwalking();
	}*/
	public void fly() {
		System.out.println("Fly Plane");
	}
}
public class Manager009 {
	public static void main(String[]args) {
		Son013 son=new Son013();
		son.fly();
		son.drive();
		son.walk();
	}
}
