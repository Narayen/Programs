// Program for updating the input values after performing functions using the values

package prgms;

import java.util.Scanner;

public class update {
	static boolean y=true;
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();		
		a = up(a, b);
		b = up(a, b);
	
		System.out.println(a + " " + b);
		
		s.close();
	}
	public static int up (int a, int b) {
		if(y) {
			y=false;
		return (a + b);
		}else {
			return Math.abs( a - 2 * b);
		}
	}
}
