// Program 24

// find the largest and smallest values and their difference


import java.util.Arrays;
import java.util.Scanner;

public class pg24ShareMarketProfit {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]-arr[0]);
        s.close();
    }
}
