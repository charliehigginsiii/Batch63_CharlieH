package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class MergeArrays {
	public int[] mergeArrays(int[]arr1,int[]arr2) {
		int[] mergedarray=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			mergedarray[i]=arr1[i];
		}
		int l=0;
		for(int i=arr1.length;i<mergedarray.length;i++) {
			mergedarray[i]=arr2[l];
			l++;
		}
		return mergedarray;
	}
	public static void main(String[]args) {
		int[]arr1= {2,9,5,3,6,1};
		int[]arr2= {10,2,4,7,9};
		int[]mergedarrays=new MergeArrays().mergeArrays(arr1,arr2);
		for(int i=0;i<mergedarrays.length;i++) {
			System.out.print(mergedarrays[i]+" ");
		}
	}
}
