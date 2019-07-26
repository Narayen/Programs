// Java program to find the occurence of the characters in a string

import java.util.Scanner;

public class frequency {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		String str = s.nextLine();
		String str2 = str.toLowerCase();
		char[] arr = str2.toCharArray();
		int count = 0;
		
		for (char i = 'a'; i <= 'z'; i++) {
			for (char c:arr) {
				if (c == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + " occured " + count + " times");
				count = 0;
			}
		}
		
		for (char c:arr) {
			if (c == ' ') {
				count++;
			}
		}7
		if (count != 0) {
			System.out.println(" " + " occured " + count + "times");
			count = 0;
		}
		s.close();
	}
}

/*

INPUT :
aaasssdddsqwe

OUTPUT : 
a occured 3 times
d occured 3 times
e occured 1 times
q occured 1 times
s occured 4 times
w occured 1 times

*/
