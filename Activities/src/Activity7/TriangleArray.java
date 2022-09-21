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
		int condition=(max*2)+1;
		for(int i=1;i<=condition;i++) {
			for(int j=1;j<i;j++) {
				if(j>max) {
					//System.out.print(k+" ");
				}else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
