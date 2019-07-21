// Program 14

// Decode the pattern (Print 11 sqr series)

package test;

import java.util.Scanner;

public class pg14Decode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println((int)Math.pow(11, i+1));
		}
		
		s.close();	
	}
}
