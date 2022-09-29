package com.cogent;

import java.util.Objects;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 29, 2022
 */
class A060{
	private int i;
	private int j;
	public A060(int i,int j) {
		super();
		this.i=i;
		this.j=j;
	}
	/*@Override
	public boolean equals(Object obj) {
		//Step 1. Check if objects are of same type
		if(obj instanceof A060) {
			//Step 2. Downcast the obj to A060 type
			A060 a=(A060)obj;
			if((i==a.i)&&(j==a.j)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}*/
	@Override
	public String toString() {
		return "A060 [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A060 other = (A060) obj;
		return i == other.i && j == other.j;
	}
	
}
public class Manager060 {
	public static void main(String[]args) {
		A060 a1=new A060(10,20);
		A060 a2=new A060(10,20);
		System.out.println(a1==a2);//false
		System.out.println(a1.equals(a2));//false
		//Two different memory objects are going to have two different locations
	}
}
