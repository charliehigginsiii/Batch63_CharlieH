package com.cogent.array;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 25, 2022
 */
public class EqualMatrices {
	public boolean isequal(int[][]arr1,int[][]arr2) {
		boolean isequal=false;
		int rowlength1=arr1.length;
		int rowlength2=arr2.length;
		int columnlength1=arr1[0].length;
		int columnlength2=arr2[0].length;
		if(rowlength1!=rowlength2||columnlength1!=columnlength2) {
			isequal=false;
		}else if(rowlength1==rowlength2&&columnlength1==columnlength2){
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[i].length;j++) {
					if(arr1[i][j]==arr2[i][j]) {
						isequal=true;
					}else {
						isequal=false;
						break;
					}
				}
			}
		}
		return isequal;
	}
	public static void main(String[]args) {
		int[][] arr1= {{4,8,1,5},{15,19,6,2},{9,4,11,7}};
		int[][] arr2= {{4,8,1,5},{15,19,6,2},{9,4,10,7}};
		boolean isequal=new EqualMatrices().isequal(arr1, arr2);
		System.out.println(isequal);
	}
}
