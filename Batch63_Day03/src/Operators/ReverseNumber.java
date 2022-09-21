package Operators;

public class ReverseNumber {
	public static void main(String[]args) {
		int num=123;
		String newnum="";
		char[]arr=Integer.toString(123).toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			newnum=newnum+arr[i];
		}
		/*
		 n=123;
		 while(!(n==0)){
			 r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		 }
		 */
		System.out.println(newnum);
	}
}
