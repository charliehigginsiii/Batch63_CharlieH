package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class SortArray {
	//Bubble Sort
	public void sortArray(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		int[]arr= {4,7,2,9,5,1};
		SortArray obj=new SortArray();
		obj.sortArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
