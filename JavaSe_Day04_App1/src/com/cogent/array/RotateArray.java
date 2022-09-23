package com.cogent.array;

public class RotateArray {
	public int[] rotateArray(int[]arr) {
		int[] rotatedarray=new int[arr.length];
		int tempelement=arr[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[j];
				arr[j]=arr[i];
			}
		}
		return rotatedarray;
	}
}
