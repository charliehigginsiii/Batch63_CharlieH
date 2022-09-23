package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class SearchElement {
	public int searchElement(int[]arr,int number) {
		int elementfound=0;
		for(int i=0;i<arr.length;i++) {
			if(number==arr[i]) {
				elementfound=arr[i];
				System.out.println("Found At position "+i);
				break;
			}else if(number!=arr[i]&&i==(arr.length-1)) {
				elementfound=-1;
				System.out.println("Element not in array.");
			}
		}
		return elementfound;
	}
	public static void main(String[]args) {
		int[] arr= {15,14,12,9,5,6,8,1,2};
		System.out.println(new SearchElement().searchElement(arr,2));
	}
}
