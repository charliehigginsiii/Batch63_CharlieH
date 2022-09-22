package Assessment_01_Loop;

import java.util.Scanner;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 22, 2022
 */
public class SmallestandLargest {
	public void enterNumbers(String number) {
		boolean again=true;
		int max=0;
		int min=0;
		int i=0;
		while(again==true) {
			System.out.println("Enter Number. Enter 'stop' to end program");
			number=new Scanner(System.in).nextLine();
			if(number.contentEquals("stop")) {
				again=false;
				break;
			}else {
				int intnumber=Integer.parseInt(number);
				if(intnumber>max) {
					max=intnumber;
				}else if(intnumber<max&&i==1) {
					min=intnumber;
				}else if(intnumber<=min) {
					min=intnumber;
				}
				i=i+1;	
			}
			
		}
		System.out.println("Largest Number: "+max);
		System.out.println("Smallest Number: "+min);	
	}
	public static void main(String[]args) {
		new SmallestandLargest().enterNumbers("");
	}
}
