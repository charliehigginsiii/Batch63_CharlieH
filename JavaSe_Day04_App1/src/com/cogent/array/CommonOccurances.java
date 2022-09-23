package com.cogent.array;

import java.util.Arrays;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class CommonOccurances {
	public int[] removeDuplicate(int[]arr) {
		Arrays.sort(arr);
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
	public int[] findCommonElements(int[]arr1,int[]arr2) {
		int increment=0;
		int count=0;
		arr1=removeDuplicate(arr1);
		arr2=removeDuplicate(arr2);
		String elementstring="";
		if(arr1.length>arr2.length) {
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					if(arr2[i]==arr1[i]) {
						count+=1;
						elementstring+=arr1[i];
						break;
					}
				}
			}
		}else if(arr1.length<arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[i]) {
						count+=1;
						elementstring+=arr1[i];
						break;
					}
				}
			}
		}else if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[i]) {
						count+=1;
						elementstring+=arr1[i];
						break;
					}
				}
			}
		}
		int[] commonelementarr=new int[elementstring.length()];
		for(int i=0;i<elementstring.length();i++) {
			commonelementarr[i]=Integer.parseInt(String.valueOf(elementstring.charAt(i)));
		}
		return commonelementarr;
	}
	public static void main(String[]args) {
		int[]arr1= {2,9,4,6,7};
		int[]arr2= {2,8,3,6};
		int[] commonelements=new CommonOccurances().findCommonElements(arr1,arr2);
		for(int i=0;i<commonelements.length;i++) {
			System.out.println(commonelements[i]);
		}
	}
}
