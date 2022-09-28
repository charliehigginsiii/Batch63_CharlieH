package com.cogent;

abstract class Animal043{
	abstract void drink();
	abstract void eat();
}
class Lion043 extends Animal043{
	@Override
	void eat() {
		System.out.println("Meat");
	}
	@Override
	void drink() {
		System.out.println("Water");
	}
}
class Cow043 extends Animal043{
	@Override
	void eat() {
		System.out.println("Grass");
	}
	@Override
	void drink() {
		System.out.println("Water");
	}
}
public class Manager043 {
	public static void main(String[]args) {
	Lion043 l1=new Lion043();
		l1.eat();
		l1.drink();
	}

}
