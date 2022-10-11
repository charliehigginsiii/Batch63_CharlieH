package com.cogent;

class Popcorn{
	void taste() {
		System.out.println("Salty");
	}
}
class Pop extends Popcorn{
	void taste() {
		System.out.println("Sweet");
	}
}
public class Manager113 {
	public static void main(String[]args) {
		Pop p=new Pop();
		p.taste();
	}

}
