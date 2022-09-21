package Assessment;

public class FindMaxofThree {
	public int maxofThree(int a,int b, int c) {
		int max=0;
		if(a>b&&a>c) {
			max=a;
		}else if(b>a&&b>c) {
			max=b;
		}else if(c>a&&c>b) {
			max=c;
		}
		return max;
	}
	public static void main(String[]args) {
		int a=5;
		int b=11;
		int c=3;
		System.out.println(new FindMaxofThree().maxofThree(a,b,c));
	}
}
