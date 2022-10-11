package com.cogent;

interface Hello{
	void greetMessage(String name);
	default void view() {
		System.out.println("This is default");
	}
	default void view1() {
		System.out.println("This is default method");
	}
	static void disp() {
		System.out.println("This is static method");
	}
	static void disp1() {
		System.out.println("This is static method");
	}
}
public class Manager116 implements Hello {
	public static void main(String[]args) {
		Manager116 m=new Manager116();
		m.greetMessage("Testing");
		Hello.disp();
		Hello.disp1();
		m.view();
		m.view1();
	}

	@Override
	public void greetMessage(String name) {
		System.out.println("Hello "+name);
	}

}
