import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
    	Scanner s = new Scanner (System.in);
    	int n = s.nextInt();
        printDiamond(n); 
        s.close();  
    } 

    static void printDiamond(int n) { 
        int space = n - 1; 
        int count = 1;
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < space; j++) { 
                System.out.print(" "); 
            }
            for (int j = 0; j <= i; j++) { 
                System.out.print(count + " ");
            	count++;
            }
      
            System.out.print("\n"); 
            space--; 
        } 
        space = 0; 
        for (int i = n; i > 0; i--) { 
            for (int j = 0; j < space; j++) {
                System.out.print(" "); 
            }
            for (int j = 1; j < i; j++) { 
                System.out.print(count + " ");
                count++;
            }
      
            System.out.print("\n"); 
            space++; 
        } 
    }  
}

/*

INPUT : 5

5
    1 
   2  3 
  4  5  6 
 7 8  9  10 
11 12 13 14 15 
 16 17 18 19 
  20 21 22 
   23 24 
    25 

*/
