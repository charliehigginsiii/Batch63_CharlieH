package com.app;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[]arr= {10,23,56,23,34,56,34,45};
		//System.out.println(arr[7]);
		//System.out.println(arr.length);
		//Type1
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
