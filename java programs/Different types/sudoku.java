// SUDOKU PROBLEM

package programs;

import java.util.Scanner;

public class sudoku {
	public static void main ( String[] args) {
		Scanner s = new Scanner (System.in);
		int[][] arr = new int[9][9];
		boolean b = false;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (!(checkRow(arr, i, j) && checkColumn(arr, i, j) )) {
					b = false;
				}
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("False");
		
		s.close();
	}
	
	public static boolean checkRow (int[][] arr, int i, int j) {
		int n = arr[i][j];
		int count = 0;
		for (int k = 0; k < 9; k++) {
			if (arr[i][k] != 0) {
				if (arr[i][k] == n) {
					count++;
				}
			}
		}
		if (count > 1) {
			return false;
		}
		return true;
	}
	
	public static boolean checkColumn (int[][] arr, int i, int j) {
		int n = arr[i][j];
		int count = 0;
		for (int k = 0; k < 9; k++) {
			if (arr[k][j] != 0) {
				if (arr[k][j] == n) {
					count++;
				}
			}
		}
		if (count > 1) {
			return false;
		}
		return true;
	}
}
