package Assessment_01_Loop;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 23, 2022
 */
public class ArmstrongNumber {
	public void getArmstrongNumbers(int number) {
		for(int i=0;i<=number;i++) {
			int sumofdigits=0;
			String s=Integer.toString(i);
			for(int j=0;j<s.length();j++) {
				sumofdigits+=Math.pow(Integer.parseInt(String.valueOf(s.charAt(j))),3);
			}
			if(sumofdigits==i) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[]args) {
		ArmstrongNumber obj=new ArmstrongNumber();
		obj.getArmstrongNumbers(500);
	}

}
