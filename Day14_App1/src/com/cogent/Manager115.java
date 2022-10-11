package com.cogent;
interface A10{
	void show();
	default void view() {
		System.out.println("This is default method");
	}
}
public class Manager115 implements A10{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String []args) {
		
	}
	
}
