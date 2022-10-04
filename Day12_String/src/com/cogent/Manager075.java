package com.cogent;

import java.util.Objects;

class A075{
	int i;
	public A075(int i) {
		super();
		this.i=i;
	}
	@Override
	public String toString() {
		return i+"";
	}
	@Override
	public int hashCode() {
		return Objects.hash(i);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof A075) {
			A075 newobj=(A075)obj;
			if (newobj.i==i) {
				return true;
			}else {
				return false;	
			}
		}else {
			return false;
		}
		/**
		 if(obj instanceof Doctor) {
			Doctor Doc=(Doctor)obj;
			if(Doc.drId==drId&&Doc.drName.contentEquals(drName)
					&&Doc.drSalary==drSalary&&Doc.drSpec.contentEquals(drSpec)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		 */
	}
	
}
public class Manager075 {
	public static void main(String[]args) {
		A074 a1=new A074(10);
		A074 a2=new A074(10);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
}