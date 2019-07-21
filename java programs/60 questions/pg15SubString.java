//Program 15

//Implement the strstr function manually

package test;

import java.util.Scanner;

public class pg15SubString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		
		System.out.println(str1.indexOf(str2));
		
		s.close();
	}
}
