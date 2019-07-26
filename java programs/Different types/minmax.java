//Print the values alternatively from the existing array

import java.util.Scanner;

public class minmax {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int[] finalArray = new int[n];
		boolean flag = true;
		int l = n - 1, sm = 0;
		
		// Get the values
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		// store the values in the required order
		for (int i=0; i<n; i++) {
			if (flag) { 
				finalArray[i] = arr[l--];
			} else {
				finalArray[i] = arr[sm++]; 
			}
			flag = !flag; 
        }
		
		// Display the values
		for (int i = 0; i < n; i++) {
			System.out.print(finalArray[i] + " ");
		}
		
		s.close();
	}
}


/*

INPUT :
7
1 2 3 4 5 6 7

OUTPUT :
7 1 6 2 5 3 4 

*/
