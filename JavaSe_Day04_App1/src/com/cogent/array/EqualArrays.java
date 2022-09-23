package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class EqualArrays {
	/*public void sortArray(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}*/
	public boolean checkIfEqual(int[]arr1,int[]arr2) {
		boolean isequal=false;
		if(arr1.length!=arr2.length) {
			isequal=false;
		}else {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i]) {
					isequal=true;
				}else {
					isequal=false;
					break;
				}
			}
		}
		return isequal;
	}
	public static void main(String[]args) {
		int[]arr1= {1,5,7,3,2};
		int[]arr2= {1,5,6,3,2};
		boolean isequal=new EqualArrays().checkIfEqual(arr1,arr2);
		System.out.println(isequal);
	}

}
