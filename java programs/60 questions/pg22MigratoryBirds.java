// Program 22

//find the type of bird and display the maximum bird of type

package test;

import java.util.Scanner;

public class pg22MigratoryBirds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1)
	            count1++;
            else if(arr[i] == 2)
	            count2++;
            else if(arr[i] == 3)
	            count3++;
            else if(arr[i] == 4)
	            count4++;
            else if(arr[i] == 5)
	            count5++;
        }
        if((count1 >= count2) && (count1 >= count3) && (count1 >= count4) && (count1 >= count5))
	        System.out.println("1");
        else if((count2 >= count3) && (count2 >= count4) && (count2 >= count5))
	        System.out.println("2");
        else if((count3 >= count4) && (count3 >= count5))
	        System.out.println("3");
        else if((count4 >= count5))
	        System.out.println("4");
        else
	        System.out.println("5");
        s.close();
    }	    
}