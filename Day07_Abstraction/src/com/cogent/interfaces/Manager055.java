package com.cogent.interfaces;

interface A055{
	void test();
}
interface B055{
	void test1();
}
interface C055 extends A055, B055{
	void test2();
}
class X055 implements C055{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Manager055 {

}
