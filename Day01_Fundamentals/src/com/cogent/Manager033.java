package com.cogent;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 23, 2022
 */
class A033{
	static int j=100;
	static {
		System.out.println("SIB-A033");
	}
	A033(){
		System.out.println("DC-A033");
	}
	{
		System.out.println("IIB-A033");
	}
}
public class Manager033 {
	static {
		System.out.println("SIB-Manager033");
	}
	public static void main(String[]args) {
		System.out.println("main starts");
		System.out.println(A033.j);
		A033 a1=new A033();
		System.out.println("main ends");
		
	}
}
