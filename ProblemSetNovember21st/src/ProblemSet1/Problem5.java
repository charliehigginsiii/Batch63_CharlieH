package ProblemSet1;

public class Problem5 {
	public int findBiggestofThree(int a,int b, int c) {
		int largest=0;
		if(a>b&&a>c) {
			largest=a;
		}else if(b>c&&b>c) {
			largest=b;
		}else if(c>b&&c>a) {
			largest=c;
		}
		return largest;
	}
	public static void main(String[]args) {
		int a=15;
		int b=24;
		int c=3;
		System.out.println("Largest of the variables: "+new Problem5().findBiggestofThree(a, b, c));
	}

}
