package Activity7;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 20, 2022
 */
public class OddNumbers {
	public static void main(String []args) {
		int max=200;
		for(int i=1;i<=max;i++) {
			if(i%2!=0&&(max-1==i||max==i||max+1==i)) {
				System.out.print(i);
			}else if(i%2!=0) {
				System.out.print(i+",");
			}
		}
	}
}
