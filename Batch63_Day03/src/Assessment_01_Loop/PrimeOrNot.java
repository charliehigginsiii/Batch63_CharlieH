package Assessment_01_Loop;

public class PrimeOrNot {
	public boolean prime(int number) {
		boolean isprime=false;
		for(int i=1;i<=number;i++) {
			if(number==1) {
				isprime=true;
			}else if(number%i==0&&i!=1&&i!=number) {
				isprime=false;
				break;
			}else if(number%i!=0) {
				isprime=true;
			}
		}
		return isprime;
	}
	public static void main(String[]args) {
		System.out.println(new PrimeOrNot().prime(5));
	}
}
