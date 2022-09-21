package Operators;

public class SumofEvensOdds {
	
	public String evenoddSums(int num) {
		int esum=0;
		int osum=0;
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				esum+=i;
			}else if(i%2!=0) {
				osum+=i;
			}
			sum+=i;
		}
		return "Even Sum: "+esum+" Odd Sum: "+osum+" Total Sum: "+sum;
	}
	public static void main(String[]args) {
		System.out.println(new SumofEvensOdds().evenoddSums(10));
	}
}
