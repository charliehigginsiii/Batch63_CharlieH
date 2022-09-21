package Assessment_01_Loop;

import java.util.Scanner;

public class PositivePrime {
	public boolean prime(int a) {
		boolean isprime=false;
		for(int i=1;i<=a;i++) {
			if(a==1) {
				isprime=true;
			}else if(a%i==0&&i!=1&&i!=a) {
				isprime=false;
				break;
			}else if(a%i!=0) {
				isprime=true;
			}
		}
		return isprime;
	}
	public static void main(String[]args) {
		System.out.println("Enter Number: ");
		int a=new Scanner(System.in).nextInt();
		System.out.println(new PositivePrime().prime(a));
	}
}
