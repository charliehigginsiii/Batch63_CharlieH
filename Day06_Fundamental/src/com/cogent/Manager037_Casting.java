package com.cogent;

class A037{
	int i=10;
	void testA() {
		System.out.println("I am from testA");
	}
}
class B037 extends A037{
	int j=20;
	void testB() {
		System.out.println("I am from testB");
	}
}
class C037{
	
}
public class Manager037_Casting {
	public static void main(String[]args) {
		//Case 5
		A037 a1=new B037();
		//a1.testB();
		B037 b1=(B037)a1;
		b1.testB();
		System.out.println(b1.j);
		//Case 4 
		//B037 b1=(B037)new A037();// Downcasting--> Complication successful but RuntimeException 
		
		//Case 3
		//A037 a1=new B037();//Upcasting
		//System.out.println(a1.j); CTE
		//a1.testB(); //CTE Compiler checks whats a1. is is of type A037 and there is no j inside A037
		//Case 2
		/*
		A037 a1=new B037();//Super class ref var can hold of sub-class
		System.out.println(a1.i);//Success
		a1.testA(); //Success
		*/
		//Case 1
		/*
		A037 a1=new A037();
		B037 b1=new B037();
		*/
	}

}

