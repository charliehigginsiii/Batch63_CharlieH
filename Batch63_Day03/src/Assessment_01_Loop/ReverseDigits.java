package Assessment_01_Loop;

import java.util.Scanner;

public class ReverseDigits {
	public int reverseInteger(int n) {
		int newint=0;
		int reverse=0;
		int r=0;
		while(!(n==0)) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
			newint=reverse;
		}
		return newint;
	}
	public static void main(String[]args) {
		System.out.println("Enter Number: ");
		System.out.println(new ReverseDigits().reverseInteger(new Scanner(System.in).nextInt()));
	}

}
