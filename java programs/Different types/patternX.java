//This program is to print "*" in the shape of X depending upon the value of input

package programs;

import java.util.Scanner;

public class patternX {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		String[][] arr = new String[n][n];
		
		for (int i = 0; i < n; i++) {
			int a = n - 1 - i;
			for (int j = 0; j < n; j++) {
				if (j==i || j == a) {
					arr[i][j] = "*";
				} else {
					arr[i][j] = " ";
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
