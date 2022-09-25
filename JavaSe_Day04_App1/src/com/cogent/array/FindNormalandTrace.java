package com.cogent.array;

import java.util.Scanner;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 25, 2022
 */
public class FindNormalandTrace {
	public int findNormal(int[][]arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum+=arr[i][j]*arr[i][j];
			}
		}
		sum=(int)Math.sqrt(sum);
		return sum;
	}
	public int findTrace(int[][]arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i][i];
		}
		return sum;
	}
	public static void main(String[]args) {
		int[][]arr= {{4,15,9,5},{11,1,8,6},{1,9,5,3}};
		System.out.println("Enter number: ");
		int n=new Scanner(System.in).nextInt();
		int normal=new FindNormalandTrace().findNormal(arr, n);
		int trace=new FindNormalandTrace().findTrace(arr, n);
		System.out.println("Normal: "+normal);
		System.out.println("Trace: "+trace);
	}

}
