package Assessment_01_Loop;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public void guessingGame(String number) {
		boolean again=true;
		int randomnumber=new Random().nextInt(20-1);
		while(again==true) {
			System.out.println("Enter Number. Enter 'stop' to end program.");
			if(number.contentEquals("stop")) {
				break;
			}else {
				number=new Scanner(System.in).nextLine();
				int intnumber=Integer.parseInt(number);
				if(intnumber>randomnumber) {
					System.out.println("Too high. Try again.");
				}else if(intnumber<randomnumber) {
					System.out.println("Too low. Try again");
				}else {
					System.out.println("Good job. You guess correctly");
					again=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		new RandomNumber().guessingGame("");

	}

}
