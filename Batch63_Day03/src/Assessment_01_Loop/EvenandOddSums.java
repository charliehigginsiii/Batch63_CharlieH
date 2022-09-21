package Assessment_01_Loop;

public class EvenandOddSums {
	public void EvenOddSums(int num) {
		int esum=0;
		int osum=0;
		int totalsum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				esum+=i;
			}else {
				osum+=i;
			}
		}
		totalsum=esum+osum;
		System.out.println("Even Sum: "+esum+" Odd Sum: "+osum+ " Total Sum: "+totalsum);
		
	}
	public static void main(String[]args) {
		new EvenandOddSums().EvenOddSums(10);
	}

}
