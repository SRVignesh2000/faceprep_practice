package backTracking;

import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] sudoku = new int[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = sc.nextInt();
			}
		}

		if (solveSudoku(sudoku)) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(sudoku[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}

	public static boolean solveSudoku(int[][] sudoku) {
		int[] unassigned = findUnassigned(sudoku);
		if (unassigned == null) {
			return true; // Sudoku is solved
		}

		int row = unassigned[0];
		int col = unassigned[1];

		for (int num = 1; num <= 9; num++) {
			if (isValid(sudoku, row, col, num)) {
				sudoku[row][col] = num;

				if (solveSudoku(sudoku)) {
					return true; // Successfully solved
				}

				sudoku[row][col] = 0; // Backtrack
			}
		}

		return false; // No solution found
	}

	public static int[] findUnassigned(int[][] sudoku) {
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if (sudoku[row][col] == 0) {
					return new int[] { row, col };
				}
			}
		}
		return null; // All places are assigned
	}

	public static boolean isValid(int[][] sudoku, int row, int col, int num) {
		for (int i = 0; i < 9; i++) {
			if (sudoku[row][i] == num || sudoku[i][col] == num) {
				return false;
			}
		}

		int startRow = row - row % 3;
		int startCol = col - col % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (sudoku[startRow + i][startCol + j] == num) {
					return false;
				}
			}
		}

		return true;
	}

}
