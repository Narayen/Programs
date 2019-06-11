//Program 3

/* Find the Maximum money ( Given street of houses (a row of houses), each house having some amount of money kept inside; now there is a thief who is going to steal this money but he has a constraint/rule that he cannot steal/rob two adjacent houses. Find the maximum money he can rob.) */

import java.util.Scanner;

public class pg03MaxMoney {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int house = s.nextInt();
		int amt = s.nextInt();
		
		int odd = 0;
		int even = 0;
		if (house % 2 == 0) {
			for (int i = 0; i < house; i++) {
				even++;
			}
			System.out.println(even * amt);
		} else {
			if (house % 2 == 1) {
				for (int i = 0; i < house; i++) {
				odd++;
				}
			System.out.println(odd * amt);
			}
		}
		s.close();
	}
}
