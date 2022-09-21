package Activity7;

import java.util.Scanner;

/**
 * 
 * @author Charlie Higgins
 * @date   Sep 20, 2022
 */
public class TriangleArray {
	public static void main(String[]args) {
		int max=new Scanner(System.in).nextInt();
		int decrement=max-1;
		for(int i=0;i<max*2;i++) {
			for(int j=0;j<max-decrement;j++) {
				System.out.print(i);
				decrement--;
			}
			System.out.println();
		}
	}
}
