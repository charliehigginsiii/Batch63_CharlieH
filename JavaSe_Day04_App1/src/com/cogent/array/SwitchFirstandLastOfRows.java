package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 25, 2022
 */
public class SwitchFirstandLastOfRows {
	public void switchElements(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==0) {
					int temp=arr[i][0];
					arr[i][0]=arr[i][arr[i].length-1];
					arr[i][arr[i].length-1]=temp;
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
		new SwitchFirstandLastOfRows().switchElements(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
