package com.cogent;
interface FullName{
	String addValues(String x, String y);
}
public class Manager120 {
	public static void main(String[]args) {
		FullName c=(a,b)-> a+" "+b;
		System.out.println("sum is "+c.addValues("Charlie","Higgins"));
	}
}
