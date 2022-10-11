package com.cogent;

public class OuterClasses {
	int a=10;
	class InnerClass{
		int a=100;
		void m1() {
			final int a=100;
			System.out.println(" M1 Inner class Method" +a);
			System.out.println(" M1 Inner class Method" +this.a);
			System.out.println(" M1 Inner class Method" +OuterClasses.this.a);
		}
	}
	void m2() {
		InnerClass i=new InnerClass();
		i.m1();
		System.out.println(" M2 Outer class Method");
	}
	
	public static void main(String[]args) {
		OuterClasses m=new OuterClasses();
		//m.m2();
		OuterClasses.InnerClass m3=m.new InnerClass();
		m3.m1();
	}
}