// Return the product of the maximum value in the array 

package programs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductInArray {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[n-1] * arr[n - 2]);
		s.close();
	}
}