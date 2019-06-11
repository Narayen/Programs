//Program 07

//Remove Characters in a String

import java.util.Scanner;

public class pg07RemoveCharactersString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str1 = s.nextLine();
		String str2 = s.nextLine();

		for (int i = 0; i < str2.length(); i++) {
			str1 = str1.replaceAll(Character.toString(str2.charAt(i)),"");
		}

		System.out.println(str1);
		s.close();
	}
}