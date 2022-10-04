package Questions;

import java.util.Scanner;

public class CheckIfNumber {
	public boolean checkNumber(String s) {
		boolean isNumber=false;
		String s1=s.replaceAll("[0-9]", "");
		if(s1.equals("")) {
			isNumber=true;
		}
		return isNumber;
	}
	public static void main(String[]args) {
		System.out.println("Enter Text: ");
		System.out.println(new CheckIfNumber().checkNumber(new Scanner(System.in).nextLine()));
		
	}

}
