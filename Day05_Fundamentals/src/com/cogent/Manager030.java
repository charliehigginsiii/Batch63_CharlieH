package com.cogent;

class A030{
	int i;
	int j;
	static int k=100;
	public A030(int i,int j) {
		super();
		this.i=i;
		this.j=j;
	}
}
public class Manager030 {
	public static void main(String[]args) {
		A030 a1=new A030(10,20);
		System.out.println(a1.i);
		System.out.println(a1.k);
		System.out.println(A030.k);
		
		A030 a2=new A030(20,30);
		a2.k=500;
		
		System.out.println(a1.k);
	}

}
