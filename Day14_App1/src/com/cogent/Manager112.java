package com.cogent;

public class Manager112 {
	int x=100;
	static int y=200;
	static void m1() {
		//System.out.println(x+" "+y);
		class Inner{
			int sum(int x,int y) {
				System.out.println(x+" "+y);
				return x+y;
			}
		}
		Inner obj=new Inner();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(100, 200));
		System.out.println(obj.sum(1000, 2000));
	}
	public static void main(String[]args) {
		Manager112 m=new Manager112();
		m.m1();
	}
}