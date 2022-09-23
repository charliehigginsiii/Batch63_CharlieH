package com.cogent;
class A028{
	public A028() {
		System.out.println("DC-A");
	}
	public A028(int i) {
		System.out.println("PC1-A");
	}
	public A028(double d) {
		System.out.println("PC2-A");
	}
	public A028(boolean b) {
		System.out.println("PC3-A");
	}
	public A028(String s) {
		System.out.println("PC4-A");
	}
	{
		System.out.println("Object Created");
	}
	
}
public class Manager028 {
	public static void main(String []args) {
		A028 a1=new A028();
		A028 a2=new A028("true");
	}
}
