package com.cogent.array;

import java.util.Arrays;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class RemoveAllOccurances {
	public int[] removeOccurances(int[]arr,int number) {
		String[] stringarr=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			stringarr[i]=Integer.toString(arr[i]);
		}
		for(int i=0;i<stringarr.length;i++) {
			if(stringarr[i].contentEquals(Integer.toString(number))) {
				stringarr[i]="occurance";
			}
		}
		String arraystring=Arrays.toString(stringarr);
		arraystring=arraystring.replaceAll("occurance","");
		arraystring=arraystring.replaceAll("\\[","");
		arraystring=arraystring.replaceAll("\\]","");
		arraystring=arraystring.replaceAll(" ","");
		arraystring=arraystring.replaceAll(",","");
		char[] chararr=arraystring.toCharArray();
		int[]newarr=new int[chararr.length];
		for(int i=0;i<chararr.length;i++) {
			newarr[i]=Integer.parseInt(String.valueOf(chararr[i]));
		}
		return newarr;
	}
	public static void main(String[]args) {
		int[]arr= {1,2,9,3,2,6,7,2,5};
		System.out.println("With Occurances");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		arr=new RemoveAllOccurances().removeOccurances(arr,9);
		System.out.println("Without Occurances");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
