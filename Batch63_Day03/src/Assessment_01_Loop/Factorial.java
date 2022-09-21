package Assessment_01_Loop;

public class Factorial {
	public int findFactorial(int num) {
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		return factorial;
	}
	public static void main(String[]args) {
		System.out.println(new Factorial().findFactorial(6));
	}

}
