//Program 17

//print words in a string in reverse

package test;

import java.util.Scanner;

public class pg17ReverseString {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String words[]=new String[str.length()];
		
		words=str.split(" ");
		
		for (int i = 0 ; i < words.length; i++) {
			String reverse = new StringBuilder(words[i]).reverse().toString();
			System.out.print(reverse + " ");
		}
				
		s.close();
	}
}