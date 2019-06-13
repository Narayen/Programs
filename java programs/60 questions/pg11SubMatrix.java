// Program 11

// find the sum of the given sub matrix in the given array

import java.util.Scanner;

public class pg11SubMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int z = s.nextInt();
		int y = s.nextInt();
		
		int[][] arr = new int[z][y];
		
		System.out.println("enter array elements :");
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("enter r1,c1,r2,c2 :");
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		
		int sum  = 0;
		
		for (int i = r1 - 1; i <= r2 - 1; i++) {
			for (int j = c1 - 1; j <= c2 - 1; j++) {
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println(sum);
		s.close();
	}
}