package Assessment_01_Loop;

public class HighestCommonFactors {
	public int findHCF(int number1, int number2) {
		int hcf=0;
		int max=0;
		if(number1>number2) {
			max=number1;
		}else {
			max=number2;
		}
		for(int i=1;i<=max;i++) {
			if(number1%i==0&&number2%i==0) {
				hcf=i;
			}
		}
		return hcf;
	}
	public static void main(String[]args) {
		System.out.println(new HighestCommonFactors().findHCF(30,25));
	}
}
