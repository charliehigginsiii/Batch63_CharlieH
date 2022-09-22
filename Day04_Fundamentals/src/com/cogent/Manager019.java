package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class Manager019 {
	int i=10;
	public static void main(String[] args) {
		new Manager019().test();
	}
	void test() {
		int i=20;
		System.out.println(i);
		
		Manager019 m1=new Manager019();
		System.out.println(m1.i);
		
		System.out.println(new Manager019().i);
	}
}
