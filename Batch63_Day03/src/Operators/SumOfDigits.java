package Operators;

public class SumOfDigits {
	public static void main(String[]args) {
		int n,sum=0,r;
		n=12355;
		while(n>=Integer.toString(n).length()) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		/** 
		char[] chararr=Integer.toString(n).toCharArray();
		int thesum=0;
		for(int i=0;i<chararr.length;i++) {
			sum+=Integer.parseInt(String.valueOf(chararr[i]));
		}
		*/
		System.out.println(sum);
		
	}
}
