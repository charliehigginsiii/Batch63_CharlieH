package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 23, 2022
 */
class A034{
	static {
		System.out.println("SIB-A034");
	}
}
class B034 extends A034{
	static {
		System.out.println("SIB-B034");
	}
}
public class Manager034 {
	public static void main(String[]args) {
		B034 b1=new B034();
		A034 a1=new A034();
	}
}
