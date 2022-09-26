package com.cogent.array;

public class SwitchFirstandLastOfColumns {
	public void switchElements(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==0) {
					int temp=arr[0][j];
					arr[0][j]=arr[arr.length-1][j];
					arr[arr.length-1][j]=temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		int[][] arr= {{4,6,1},{9,3,5},{8,7,2}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		new SwitchFirstandLastOfColumns().switchElements(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}