package Activity8;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 21, 2022
 */
public class PrimeNumber {
	public boolean primeNumber(int max,int number) {
		max=150;
		boolean isprime=false;
		for(int i=1;i<=max;i++) {
			if(number==1) {
				isprime=true;
			}else if((number%i==0&&i!=1&&i!=number)) {
				isprime=false;
				break;
			}else if(number%i!=0) {
				isprime=true;
			}
		}
		
		return isprime;
	}
	public static void main(String[]args) {
		int max=150;
		for(int i=1;i<=max;i++) {
			if(new PrimeNumber().primeNumber(150,i)==true){
				System.out.println(i);
			}
		}
	}
}
