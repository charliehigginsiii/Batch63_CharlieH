package Assessment_01_Loop;

import java.util.Scanner;

public class EnterNumbers {
	public void enteringNumbers(String number) {
		boolean doagain=true;
		int p=0;
		int n=0;
		int z=0;	
		while(doagain==true) {
			System.out.println("Enter Number. Enter 'stop' to end program");
			number=new Scanner(System.in).nextLine();
			if(number.contentEquals("stop")) {
				doagain=false;
				break;
			}else {
				int intnumber=Integer.parseInt(number);
				if(intnumber>0) {
					p++;
				}else if(intnumber==0) {
					z++;
				}else {
					n++;
				}
			}
		}
		System.out.println("Positives: "+p);
		System.out.println("Zeros: "+z);
		System.out.println("Negatives: "+n);
	}
	public static void main(String[]args) {
		new EnterNumbers().enteringNumbers("");
	}
}
