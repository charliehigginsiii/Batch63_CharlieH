package com.cognizant.shapes;
import java.util.Scanner;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 20, 2022
 */
public class Shapes {
	int numberOfSides=0;
	int sideorradiuslength=0;
	double calculateShapeArea(int numberofSides, int sideorradiuslength) {
		double area=0.0;
		if(numberofSides==1) {
			area=new Circle().calculateArea(sideorradiuslength);
		}else if(numberofSides==3) {
			area=new Triangle().calculateArea(sideorradiuslength);
		}else if(numberofSides==4) {
			area=new Square().calculateArea(sideorradiuslength);
		}else {
			System.out.println("No shapes present");
		}
		return area;
	}
	public static void main(String[]args) {
		System.out.print(new Shapes().calculateShapeArea(3,12));
	}
}
