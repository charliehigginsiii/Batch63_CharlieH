package Activity6;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 20, 2022
 */
public class SimpleInterestCalculator {
	static double principleamount=0.0;
	static int numberofyears=0;
	void calculateSimpleInterest(double principle,int numberofyears) {
		double interest=0.0;
		if(principleamount>1.0) {
			if(numberofyears>10) {
				interest=(principleamount*100000.0)*numberofyears*10/100;
			}else if(numberofyears<10){
				interest=(principleamount*100000.0)*numberofyears*9.5/100;
			}
		}else if(principleamount<1) {
			if(numberofyears>10) {
				interest=(principleamount*100000.0)*numberofyears*5/100;
			}else if(numberofyears<10) {
				interest=(principleamount*100000.0)*numberofyears*4.5/100;
			}
		}
		System.out.println("The interest amount for a principal of $" + principleamount*100000.0 +" and "+ numberofyears+" years is $"+interest);
		
	}
	public static void main(String[]args) {
		SimpleInterestCalculator obj=new SimpleInterestCalculator();
		principleamount=.5;
		numberofyears=5;
		obj.calculateSimpleInterest(principleamount,numberofyears);
	}
}
