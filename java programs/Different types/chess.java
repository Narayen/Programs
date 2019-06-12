// CHESS PROGRAM

// find the positions of a placed king that is not attacked by a knight

import java.util.Scanner;

public class chess {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no of knights :");
		int knight = s.nextInt();
		System.out.println("Enter no of king :");
		int king = s.nextInt();
		int[][] board = new int[8][8];

		// Entering knight position
		for (int z = 0; z < knight; z++) {
			System.out.println("Enter knight position :");
			int i = s.nextInt();
			int j = s.nextInt();
			if((i >= 1 && i <= 8) && (j >= 1 && j <= 8)) {
				board[i- 1][j -1] = 1;
			}
		}
		
		// Solving knight attack positions
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				if (board[i][j] == 1) {
					if(i+2 < 8 && j+1 < 8 && i+2 >= 0 && j+1 >=0) {
						board[i+2][j+1] += 2;
					}
					if(i+2 < 8 && j-1 < 8 && i+2 >= 0 && j-1 >=0) {
						board[i+2][j-1] += 2;
					}
					if(i+1 < 8 && j+2 < 8 && i+1 >= 0 && j+2 >=0) {
						board[i+1][j+2] += 2;
					}
					if(i-1 < 8 && j+2 < 8 && i-1 >= 0 && j+2 >=0) {
						board[i-1][j+2] += 2;
					}
					if(j+1 < 8 && i-2 < 8 && i-2 >= 0 && j+1 >=0) {
						board[i-2][j+1] += 2;
					}
					if(i-2 < 8 && j-1 < 8 && i-2 >= 0 && j-1 >=0) {
						board[i-2][j-1] += 2;
					}
					if(i+1 < 8 && j-2 < 8 && i+1 >= 0 && j-2 >=0) {
						board[i+1][j-2] += 2;
					}
					if(i-1 < 8 && j-2 < 8 && i-1 >= 0 && j-2 >=0) {
						board[i-1][j-2] += 2;
					}
				}
			}
		}
		
		// chess board knight attach
		System.out.println("Chess Board after knight attack :");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
		// Entering king position
		System.out.println("Enter king position");
		for (int z = 0; z < king; z++) {
			int i = s.nextInt();
			int j = s.nextInt();
			if((i >= 1 && i <= 8) && (j >= 1 && j <= 8)) {
				board[i- 1][j -1] = 9;
			}
		}
		
		// Solving King attack position
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				if (board[i][j] == 9) {
					if(i-1 < 8 && j+1 < 8 && i-1 >= 0 && j+1 >=0) {
						board[i-1][j+1] = 3;
					}
					if(i+1 < 8 && j-1 < 8 && i+1 >= 0 && j-1 >=0) {
						board[i+1][j-1] = 3;
					}
					if(i-1 < 8 && j-1 < 8 && i-1 >= 0 && j-1 >=0) {
						board[i-1][j-1] = 3;
					}
					if(i-1 < 8 && j < 8 && i-1 >= 0 && j >=0) {
						board[i-1][j] = 3;
					}
					if(i < 8 && j+1 < 8 && i >= 0 && j+1 >=0) {
						board[i][j+1] = 3;
					}
					if(i+1 < 8 && j+1 < 8 && i+1 >= 0 && j+1 >=0) {
						board[i+1][j+1] = 3;
					}
					if(i+1 < 8 && j < 8 && i+1 >= 0 && j >=0) {
						board[i+1][j] = 3;
					}
					if(i < 8 && j-1 < 8 && i >= 0 && j-1 >=0) {
						board[i][j-1] = 3;
					}
				}
			}
		}
		
		//Chess board after all the attack
		System.out.println("Chess Board :");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
		// Returns all the empty spaces which are not attacked 
		System.out.println("Chess Board empty spaces :");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				if (board[i][j] == 0)
				System.out.println(i + " " + j);
			}
		}
		
		// Returns all the positions that are not attacked
		System.out.println("Chess Board occupied spaces :");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				if (board[i][j] == 2)
				System.out.println(i + " " + j);
			}
		}
		
		s.close();
	}
}