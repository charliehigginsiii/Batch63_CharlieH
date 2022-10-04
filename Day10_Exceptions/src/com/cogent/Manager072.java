package com.cogent;
class A072{
	void test() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Sleeping");
	}
}
class B072 extends A072{
	@Override
	void test() throws StackOverflowError{
		System.out.println("Hello");
	}
}
public class Manager072 {
	public static void main(String[]args) {
		new B072().test();
		//new A072().test();
	}
}
