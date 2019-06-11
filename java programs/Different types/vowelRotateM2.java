package programs;

import java.util.Scanner;

public class vowelRotateM2 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] a = str.toCharArray();
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
				a[i] = str.charAt(initial);
				initial = i;
			}
		}
		
		System.out.println(a);
		s.close();
	}
}