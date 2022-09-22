package com.app;

import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String[]args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter X and Y");
		int x=c.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+10;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]");
		}
	}
}
