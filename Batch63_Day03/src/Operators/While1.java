package Operators;

public class While1 {
	public static void main(String[]args) {
	int i=0;
	int sum=0;
		while(i<=10) {
			System.out.println(i);
			sum=sum+i++;
		}
		do {
			System.out.println(i);
			sum=sum+i++;
		}while(i<=10);
	}
}
