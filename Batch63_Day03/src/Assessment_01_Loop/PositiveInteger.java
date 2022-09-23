package Assessment_01_Loop;

import java.util.Scanner;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 23, 2022
 */
public class PositiveInteger {
	public void enterPositiveInteger(int number) {
		boolean keepentering=true;
		while(keepentering==true) {
			System.out.println("Enter Number. Enter 0 to stop program: ");
			number=new Scanner(System.in).nextInt();
			if(number==0) {
				keepentering=false;
			}else if (number<0){
				System.out.println("Negative Number. Has to be positive");
			}else{
				System.out.println(number);
			}
		}
		
	}
	public static void main(String[]args) {
		int number=0;
		new PositiveInteger().enterPositiveInteger(number);
	}
}
