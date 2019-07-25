import java.util.Scanner;

public class patternX {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		String str = "PROGRAM";
		
		Character[][] arr = new Character[str.length()][str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			int a = str.length() - 1 - i;
			for (int j = 0; j < str.length(); j++) {
				if (j==i || j == a) {
					arr[i][j] = str.charAt(j);
				} else {
					arr[i][j] = ' ';
				}
			}
		}
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		s.close();
	}
}

/*
OUTPUT : 

P           M 
  R       A   
    O   R     
      G       
    O   R     
  R       A   
P           M 

*/
