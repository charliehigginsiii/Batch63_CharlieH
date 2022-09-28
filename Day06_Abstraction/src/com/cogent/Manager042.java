package com.cogent;

abstract class A042{
	abstract void test();
}
class B042 extends A042{
	@Override
	void test() {
		System.out.println("I am from test()");
	}
}
public class Manager042 {

}
