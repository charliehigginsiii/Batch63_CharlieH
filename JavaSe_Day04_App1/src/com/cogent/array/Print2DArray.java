package com.cogent.array;

import java.util.Random;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class Print2DArray {
	public static void main(String[]args) {
		int[][] twodarray=new int[2][3];
		for(int i=0;i<twodarray.length;i++) {
			for(int j=0;j<twodarray[i].length;j++) {
				twodarray[i][j]=new Random().nextInt(10-1);
			}
		}
		for(int i=0;i<twodarray.length;i++) {
			for(int j=0;j<twodarray[i].length;j++) {
				System.out.print(twodarray[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
