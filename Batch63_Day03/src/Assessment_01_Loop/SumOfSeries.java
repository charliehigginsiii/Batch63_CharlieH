package Assessment_01_Loop;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 23, 2022
 */
public class SumOfSeries {
	public double sumSeries(double number) {
		double sum=1.0;
		for(double i=1.0;i<=number;i++) {
			sum+=(1/i);
		}
		return sum;
	}
	public static void main(String[]args) {
		System.out.println(new SumOfSeries().sumSeries(9.0));
	}

}
