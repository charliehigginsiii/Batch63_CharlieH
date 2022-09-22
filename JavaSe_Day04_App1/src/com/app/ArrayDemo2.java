package com.app;

public class ArrayDemo2 {
	public static void main(String[]args) {
		int[] arr0= {23,12,34,45};
		int[] arr=new int[10];
		int[] arr1=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+10;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] ->"+arr[i]);
		}
	}

}
