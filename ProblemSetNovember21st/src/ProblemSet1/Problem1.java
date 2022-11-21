package ProblemSet1;


public class Problem1 {
	public int findLargest(int a,int b) {
		int largest=0;
		if(a>b) {
			largest=a;
		}else if(a<b) {
			largest=b;
		}
		return largest;
	}
	public static void main(String[]args) {
		int a=50;
		int b=10;
		System.out.println("Largest Number of "+a+" and "+b+": "+new Problem1().findLargest(a, b));
	}

}
