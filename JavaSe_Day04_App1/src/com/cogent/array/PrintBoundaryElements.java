package com.cogent.array;

public class PrintBoundaryElements {
	public void getBoundryElements(int[][]arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==(arr.length-1)||i==0||j==(arr[0].length-1)||j==0) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		int[][]arr= {{3,5,1,10},{6,2,4,19},{9,7,8,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		new PrintBoundaryElements().getBoundryElements(arr);
	}
}
