package com.cognizant.shapes;
/**
 * 
 * @author Charlie
 * @date   Sep 20, 2022
 */
public class Rectangle {
	double breadth=0.0;
	double length=0.0;
	public Rectangle(double length, double width) {
		this.length=length;
		this.breadth=width;
	}
	public double calculateArea() {
		System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
		return this.length*this.breadth;
	}
}
