// Reverse each word in a given string

import java.util.Scanner;

public class wordReverse {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		char[] arr1 = s.nextLine().toCharArray();
		String ans1 = "";
		
		for (int i = arr1.length - 1; i >= 0; i--) {
			ans1 = ans1 + "" + arr1[i];
		}
		
		String[] arr2 = ans1.split(" ");
		String ans2 = "";
		
		for (int i = arr2.length - 1; i >= 0; i--) {
			ans2 = ans2 + " " + arr2[i];
		}

		//System.out.println(ans1);
		System.out.println(ans2.trim());
		s.close();
	}
}
