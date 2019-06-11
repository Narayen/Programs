//program 2

//Find the minimum difference between two numbers in an given array

package test;

import java.util.Scanner;

public class pg02MinDiff {
	public static void main(String[] args) {
		
		int diff = Integer.MAX_VALUE;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter array Size :");
		int a = s.nextInt();
		
		int[] arr = new int[a];
		
		int b = arr.length;
		
		System.out.println("Enter array elements : ");
		
		for (int i= 0; i < a; i++) {
			arr[i] = s.nextInt();
		}
			
		//int diff = Collections.max(Arrays.asList(arr));
		
		for (int i = 0; i < b-1; i++) {
			for (int j = i+1; j < b; j++) {
				if (Math.abs((arr[i] - arr[j])) < diff) {
					diff = Math.abs((arr[i] - arr[j]));
				}
			}
		}
		
		System.out.print(diff);
		s.close();
	}
}