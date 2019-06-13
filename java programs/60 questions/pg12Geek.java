// Program 12

// Geek and coffee shop - find the number of cups of coffee he can have.

import java.util.Scanner;

public class pg12Geek {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();

		for(int i=2;i<=m;i++) {
			n=n/2;
		}

		System.out.println(n);
		s.close();
	}
}