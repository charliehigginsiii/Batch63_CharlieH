package com.cogent.array;

public class SortAscendingArray {
	//Bubble Sort
	public void sortAscendingArray(int[]arr) {
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
		SortAscendingArray obj=new SortAscendingArray();
		obj.sortAscendingArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

