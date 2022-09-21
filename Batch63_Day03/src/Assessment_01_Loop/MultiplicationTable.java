package Assessment_01_Loop;

import java.util.Scanner;

public class MultiplicationTable {
	public void table(int a) {
		for(int i=0;i<=12;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
	public static void main(String[]args) {
		System.out.println("Enter Number: ");
		new MultiplicationTable().table(new Scanner(System.in).nextInt());
		
	}
}
