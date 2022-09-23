package com.cogent.array;

public class SortDescendingArray {
	//Bubble Sort
	public void sortDescendingArray(int[]arr) {
		for(int i=arr.length-1;i>0;i--) {
			for(int j=arr.length-1-i;j>0;j--) {
				if(arr[j]>arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		int[]arr= {4,7,2,9,5,1};
		SortDescendingArray obj=new SortDescendingArray();
		obj.sortDescendingArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}