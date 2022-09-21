package Assessment_01_Loop;

import java.util.Scanner;

public class Exponents {
	public int computeExponent(int a,int b) {
		int result=1;
		for(int i=0;i<b;i++) {
			result=result*a;
		}
		return result;
	}
	public static void main(String[]args) {
		System.out.println("Enter Number: ");
		int a=new Scanner(System.in).nextInt();
		System.out.println("Enter Number: ");
		int b=new Scanner(System.in).nextInt();
		System.out.println(new Exponents().computeExponent(a,b));
	}
}
