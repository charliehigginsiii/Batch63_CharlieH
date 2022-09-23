package com.cogent.array;

import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class Print2DArray {
	public static void main(String[]args) {
		System.out.println("Enter number of rows: ");
		int rows=new Scanner(System.in).nextInt();
		System.out.println("Enter number of Columns: ");
		int columns=new Scanner(System.in).nextInt();
		int[][] twodarray=new int[rows][columns];
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
