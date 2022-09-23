package com.cogent.array;

import java.util.Arrays;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class RemoveDuplicates {
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
	public int[] removeDuplicate(int[]arr) {
		sortArray(arr);
		String duplicatestring="";
		String[]stringarr=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			stringarr[i]=Integer.toString(arr[i]);
		}
		for(int i=0;i<stringarr.length;i++) {
			for(int j=i+1;j<stringarr.length;j++) {
				 if(stringarr[j].contentEquals(stringarr[i])) {
					stringarr[j]="duplicate";
				}
			}
		}
		String arraystring=Arrays.toString(stringarr);
		arraystring=arraystring.replaceAll("duplicate","");
		arraystring=arraystring.replaceAll(" ","");
		arraystring=arraystring.replaceAll(",","");
		arraystring=arraystring.replaceAll("\\[","");
		arraystring=arraystring.replaceAll("\\]","");
		char[] chararray=arraystring.toCharArray();
		int[] newarr=new int[chararray.length];
		for(int i=0;i<chararray.length;i++) {
			newarr[i]=Integer.parseInt(String.valueOf(chararray[i]));
		}
		return newarr;
	}
	public static void main(String[]args) {
		int[]arr= {4,3,9,4,7,1,5};
		System.out.println("With Duplicates");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		arr=new RemoveDuplicates().removeDuplicate(arr);
		System.out.println("Without Duplicates");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
