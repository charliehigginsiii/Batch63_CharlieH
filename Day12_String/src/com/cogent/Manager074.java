package com.cogent;

class A074{
	int i;
	public A074(int i) {
		super();
		this.i=i;
	}
	@Override
	public String toString() {
		return i+"";
	}
}
public class Manager074 {
	
	public static void main(String[]args) {
		String s1="Java";
		String s2=new String();
		String s3=new String("Java");
		String s4=s1+s3;
		A074 a1=new A074(10);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(a1);
	}
}
