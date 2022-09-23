package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class CopyArray {
	public int[] copyArray(int[]arr1,int[]arr2) {
		arr2=new int[arr1.length];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr1[i];
		}
		return arr2;
	}
	public static void main(String[]args) {
		int[]arr1= {1,5,3,9};
		int[]arr2 = null;
		arr2=new CopyArray().copyArray(arr1,arr2);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
