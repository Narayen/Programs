/*
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. 
One of the integers is missing in the list. Write an efficient code to find the missing integer. If no number is missing print -1.
*/

import java.util.Scanner;

public class missingNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int count = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] != count) {
				System.out.println(arr[i] - 1);
				break;
			}
			else {
				count++;
			}
		}
		s.close();
	}
}
