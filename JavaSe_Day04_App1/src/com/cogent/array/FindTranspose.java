package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class FindTranspose {
	public int[][] findTranspose(int[][]arr1){
		int[][]Transpose=new int[3][3];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				Transpose[i][j]=arr1[j][i];
			}
		}
		return Transpose;
		
	}
	public static void main(String[]args) {
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] Transpose=new FindTranspose().findTranspose(arr1);
		System.out.println("Original Array: ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose: ");
		for(int i=0;i<Transpose.length;i++) {
			for(int j=0;j<Transpose[i].length;j++) {
				System.out.print(Transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
}
