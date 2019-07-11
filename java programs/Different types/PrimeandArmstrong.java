//This program is to print the number which is prime number or an armstrong number or both

package prgms;

import java.util.Scanner;

public class PrimeandArmstrong {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		//To get the value which is greater than the value of int type

		long n = s.nextLong();
		int flag = 0;
		int flag2 = 0;
		
		flag = checkPrimeNumber(n);
		if (flag == 1) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
		
		flag2 = checkArmstrongNumber(n);
		if (flag2 == 1) {
			System.out.println(n + " is a armstrong number");
		} else {
			System.out.println(n + " is not an armstrong number");
		}
		s.close();
	}

	// Function to check if the number is a prime number
	public static int checkPrimeNumber(long n) {
		
		long m = n/2;
		
		if (n == 0 || n == 1) {
			return 0;
		}
		else {
			for (long i = 2; i <= m; i++) {
				if (n % i == 0) {
					return 0;
				}
			}
		}
		return 1;
	}

	// Function to check if the number is an Armstrong number	
	public static int checkArmstrongNumber(long n) {
		
		long a = n;
		int length = String.valueOf(n).length();
		long rem, res = 0;
		while (n != 0) {
			rem = n % 10;
			res += Math.pow(rem, length);
			n /= 10;
		}
		
		if (res == a) {
			return 1;
		} else {
		return 0;
		}
	}
}