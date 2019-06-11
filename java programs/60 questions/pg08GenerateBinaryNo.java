//Program 08

//Generate and print all binary numbers with decimal values from 1 to N

import java.util.Scanner;

public class pg08GenerateBinaryNo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter n value :");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(Integer.toBinaryString(i) + " ");
		}
		s.close();
	}
}