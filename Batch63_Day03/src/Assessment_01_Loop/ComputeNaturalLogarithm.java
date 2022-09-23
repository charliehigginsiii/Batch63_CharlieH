package Assessment_01_Loop;

public class ComputeNaturalLogarithm {
	public double computeNaturalLogarithm(double number) {
		double naturallogarithm=1;
		for(double i=1.0;i<=number;i++) {
			naturallogarithm-=(1/i);
		}
		return naturallogarithm;
	}
	public static void main(String[]args) {
		System.out.println(new ComputeNaturalLogarithm().computeNaturalLogarithm(2));
	}
}
