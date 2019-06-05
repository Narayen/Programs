//Program 04

/* Rotate the given array counterclockwise for N number of times */

import java.util.Scanner;

public class pg04RotateArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter Array Size :");
		int size = s.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter array elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("Enter rotate value : ");
		int n = s.nextInt();
		//n = n % size;
		for (int j = 1; j <= n; j++) {

			int first = arr[0];
			
			for (int i = 0; i < size-1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[size-1] = first;
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

		s.close();
	}
}
