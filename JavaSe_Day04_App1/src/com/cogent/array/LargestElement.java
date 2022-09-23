package com.cogent.array;

public class LargestElement {
	public int findLargestElement(int[]arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[]args) {
		int[]arr= {1,9,3,25,6,8,3};
		System.out.println(new LargestElement().findLargestElement(arr));
	}
}
