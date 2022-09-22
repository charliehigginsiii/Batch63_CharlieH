package com.cogent;
class A023{
	public A023() {
		System.out.println("DC-A");
	}
	public A023(int i) {
		System.out.println("PC-A");
	}
}
class B023 extends A023{
	public B023() {
		System.out.println("DC-B");
	}
}
public class Manager023 {
	public static void main(String[]args) {
		B023 b1=new B023();
	}
}
