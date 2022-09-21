package Assessment;

public class EvenorOdd {
	public String evenorOdd(int number) {
		String evenorodd="";
		if(number%2==0) {
			evenorodd="Even";
		}else {
			evenorodd="Odd";
		}
		return evenorodd;
	}
	public static void main(String[]args) {
		EvenorOdd obj=new EvenorOdd();
		System.out.println(obj.evenorOdd(5));
	}
}
