// Program 05

// Print the number of times a word is repeated twice in a given sentence

import java.util.Scanner;

public class pg05TwiceCounter {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();

		String words[]=new String[str.length()];
		words=str.split(" ");
		int i,count=0,j,res=0;

		for(i=0;i<words.length;i++) {
			count=0;
			for(j=0;j<words.length;j++) {
				if(i!=j) {
					if(words[i].compareTo(words[j])==0) {
						count++;
					}
				}
			}
			if(count == 1) {
				res=res+1;
			}  
		}

		System.out.println("The number of words which repeated twice "+res/2);
		s.close();
	}
}