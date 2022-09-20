package com.cogent;

class Book003{
	String title;
	int pages;
	double price;
}
public class Manager003 {
	public static void main(String[]args) {
	Book003 obj1;
	Book003 obj2=new Book003();
	obj2.title="Learn Java in 1 minute";
	Book003 obj3=new Book003();
	obj2.pages=100;
	Book003 obj4=new Book003();
	obj4.title="Java";
	obj1=obj4;
	obj2=obj4;
	obj3=obj1;
	System.out.println(obj1.title);
	}

}
