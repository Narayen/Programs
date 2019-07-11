//PProgram to find the duplicate value in the given array and returning its first and last index positions

package prgms;

import java.util.Scanner;

public class duplicate {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int key = s.nextInt();
		int first = 0;
		int last = n-1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				if (i < last)
				last = i;
			}
			if (arr[i] == key) {
				first  = i;
			}
		}
		
		System.out.println(first + " " + last);
		
		s.close();
	}
}
