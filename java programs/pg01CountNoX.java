//Program 1

/* Count the number of occurrences of value X. ( Given an integer X within the range of 0 to 9, and given two positive integers as upper and lower bounds respectively, find the number of times X occurs as a digit in an integer within the range, excluding the bounds. Print the frequency of occurrence as output.) */

import java.util.Scanner;

public class pg01CountNoX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int n = s.nextInt();
		s.close();
		
		int count = 0;
		for (int i = start + 1; i < end; i++) {
			String str = Integer.toString(i);
			int len = str.length();
			for (int j = 0; j < len; j++) {
				if (str.charAt(j) == (n + 48)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}