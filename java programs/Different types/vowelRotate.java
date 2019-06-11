// Rotate the vowels that are present in a word 

// Method 1 - only by printing the chracters

import java.util.Scanner;

public class vowelRotate {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();

		int count = 0;
		int initial = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U' ||str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
				count = i;
			}
		}
		
		initial = count;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U' ||str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
				System.out.print(str.charAt(initial));
				initial = i;
			}
			else {
				System.out.print(str.charAt(i));
			}
		}

		System.out.println();

		s.close();
	}
}