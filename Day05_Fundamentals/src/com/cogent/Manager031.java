package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 23, 2022
 */
class A031 {
	int i=0;
	void test1() {
		System.out.println("I am from test1");
	}
	static int j=20;
	static void test2() {
		System.out.println("I am from test1");
	}
}
public class Manager031 {
	public static void main(String[]args) {
		new A031().test1();
		System.out.println(A031.j);
		A031.test2();
		System.out.println(A031.j);
	}

}

