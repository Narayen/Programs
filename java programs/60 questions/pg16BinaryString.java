//Program 16

//Print the count of substrings starting and ending with 1 in given binary value 

package test;

import java.util.Scanner;

public class pg16BinaryString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter bit :");
		String s1 = s.next();
		int count = 0;
	
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				String temp = s1.substring(i, j+1);
				if (temp.length() > 1) {
					if (temp.charAt(0) == '1' && temp.charAt(temp.length()-1) == '1') {
						count++;
					}
				}
			}
		}
		
		System.out.println("Count : " + count);
		s.close();
	}
}
