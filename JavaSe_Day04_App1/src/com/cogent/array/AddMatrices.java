package com.cogent.array;

import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class AddMatrices {
	public int[][] addMatricies(int[][]arr1,int[][]arr2, int rows1, int rows2, int columns1, int columns2){
		int[][]sum=new int[rows1][columns1];
		if(arr1.length!=arr2.length) {
			System.out.println("Arrays are not equal in size!");
		}else {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[i].length;j++) {
					sum[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
		}
		return sum;
	}
	public static void main(String[]args) {
		System.out.println("Enter number of rows: ");
		int rows1=new Scanner(System.in).nextInt();
		System.out.println("Enter number of Columns: ");
		int columns1=new Scanner(System.in).nextInt();
		System.out.println("Enter number of rows: ");
		int rows2=new Scanner(System.in).nextInt();
		System.out.println("Enter number of Columns: ");
		int columns2=new Scanner(System.in).nextInt();
		int[][]arr1=new int[rows1][columns1];
		int[][]arr2=new int[rows2][columns2];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=new Random().nextInt(10-1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=new Random().nextInt(10-1);
			}
		}
		int[][]sums=new AddMatrices().addMatricies(arr1,arr2,rows1,rows2,columns1,columns2);
		for(int i=0;i<sums.length;i++) {
			for(int j=0;j<sums[i].length;j++) {
				System.out.print(sums[i][j]+" ");
			}
			System.out.println();
		}
	}
}
