package com.cogent.interfaces;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 27, 2022
 */
interface I051{
	int i=10;
	void test();
}
class A051 implements I051{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Manager051 implements I051{
	public static void main(String []args) {
		System.out.println(I051.i);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
