package Assessment_01_Loop;

import java.util.Scanner;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class DoWhileSum {
	public void getSum(int a,int b, char continueprogram) {
		int sum=0;
		boolean again=true;
		int i=0;
		do {
			if(i>0) {
				System.out.println("Do you want to enter another set of numbers? Type y for yes or n for no.");
				continueprogram=new Scanner(System.in).next().charAt(0);
			}
			if(continueprogram=='y') {
				again=true;
			}else if(continueprogram=='n') {
				again=false;
				break;
			}
			System.out.println("Enter First Number: ");
			a=new Scanner(System.in).nextInt();
			System.out.println("Enter Second Number: ");
			b=new Scanner(System.in).nextInt();
			sum=a+b;
			System.out.println(sum);
			i++;
		}while(again==true);
	}
	public static void main(String[]args) {
		new DoWhileSum().getSum(0,0,'y');
	}

}
