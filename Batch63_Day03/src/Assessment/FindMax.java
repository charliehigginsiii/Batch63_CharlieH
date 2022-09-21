package Assessment;

public class FindMax {
	public int findMax(int a,int b) {
		int max=0;
		if(a>b) {
			max=a;
		}else if(a<b) {
			max=b;
		}
		return max;
	}
	public static void main(String[]args) {
		int a=9;
		int b=6;
		int maxnumber=new FindMax().findMax(a,b);
		System.out.println(maxnumber);
	}
}
