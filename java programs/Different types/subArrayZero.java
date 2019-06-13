// Program to find if there exists a sub array in an given array

import java.util.Scanner;

public class subArrayZero {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum == 0) {
					count++;
					break;
				}
			}
		}
		if (count == 1 ) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		s.close();
	}
}