//Program 06

//Find the total number of the count of set bits in a given value

import java.util.Scanner;

public class pg06CountBits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter n value :");
		int n = s.nextInt();
		String z = "";
		int count = 0;

		for (int i = 0; i <= n; i++) {
			z = Integer.toBinaryString(i);

			for (int j = 0; j < z.length(); j++) {
				if (z.charAt(j) == 49) {
					count++;
				}
			}
		}

		System.out.println(count);
		s.close();
	}
}