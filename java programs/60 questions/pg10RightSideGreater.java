//Program 10

//print the greater value on the right side of a given array

import java.util.Arrays;
import java.util.Scanner;

public class pg10RightSideGreater {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of numbers : ");
		int n = s.nextInt();
		System.out.println("Enter the array values : ");
		int[] arr = new int[n];

		System.out.println("Enter numbers : ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < n; i++) {
			int[] tempArr = Arrays.copyOfRange(arr, i, n);
			Arrays.sort(tempArr);
			arr[i] = tempArr[tempArr.length-1];
			sb.append(arr[i]+",");
		}
		sb.append("-1");

		System.out.println(sb.toString());
		s.close();
	}
}