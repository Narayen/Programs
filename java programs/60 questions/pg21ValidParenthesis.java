// PROGRAM 21

// Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid.

import java.util.Scanner;

public class pg21ValidParenthesis {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		String str = s.next();
		
		int count = 0;
		int star = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
			}
			if (str.charAt(i) == ')') {
				count--;
			}
			if (str.charAt(i) == '*') {
				star++;
			}
		}
		int temp = Math.abs(count);
		if ((count == 0) || (star == temp)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		s.close();
	}
}