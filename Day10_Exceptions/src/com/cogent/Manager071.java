package com.cogent;


class A071{
	void test() throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	static void display() throws ClassNotFoundException{
		new A071().test();
	}
}
public class Manager071 {
	public static void main(String[]args) throws ClassNotFoundException{
		new Manager071().test2();
	}
	void test2() {
		try {
			A071.display();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
