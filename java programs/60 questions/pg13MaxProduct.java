//Program 13

//Print the maximum product of two numbers in an array

package test;

import java.util.Arrays;
import java.util.Scanner;

public class pg13MaxProduct {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = s.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter array elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		int max = arr[size-2] * arr[size-1];
		
		System.out.println(max);
		s.close();
	}
}
