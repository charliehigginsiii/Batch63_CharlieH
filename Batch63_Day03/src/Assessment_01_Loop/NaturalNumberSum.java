package Assessment_01_Loop;

public class NaturalNumberSum {
	public int sumofNaturalNumbers(int maxnum) {
		int sum=0;
		for(int i=0;i<maxnum;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[]args) {
		System.out.println(new NaturalNumberSum().sumofNaturalNumbers(10));
	}
}
