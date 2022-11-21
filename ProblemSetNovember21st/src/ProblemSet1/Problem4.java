package ProblemSet1;

public class Problem4 {
	public String isEvenorOdd(int a) {
		String evenodd=(a%2==0)?"Number is even":"Number is odd";
		return evenodd;
	}
	public static void main(String[]args) {
		int a =8;
		System.out.println(new Problem4().isEvenorOdd(a));
	}

}
