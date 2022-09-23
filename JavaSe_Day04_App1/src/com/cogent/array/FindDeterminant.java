package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class FindDeterminant {
	public int findDeterminant(int[][]arr) {
		int determinant=arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
		return determinant;
	}
	public static void main(String[]args) {
		int[][]arr={{9,4},{2,6}};
		int determinant=new FindDeterminant().findDeterminant(arr);
		System.out.println(determinant);
	}

}
