//Program 18

//Convert a first letter of word to uppercase

import java.util.Scanner;

public class pg18UpperCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = s.nextLine();
		
		StringBuilder upper = new StringBuilder(str.length());
		String[] words = str.split(" ");
		
		for (int i = 0 ; i < words.length; i++) {
			//StringBuilder upper = new StringBuilder(Character.toUpperCase(words[i].charAt(0)));
			upper.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");	
		}
		
		System.out.print(upper + " ");
		s.close();
	}
}