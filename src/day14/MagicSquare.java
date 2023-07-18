package day14;

import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Read the number of rows/columns in the matrix
		int n = input.nextInt();

		// Create a 2D array to store the matrix elements
		int[][] matrix = new int[n][n];

		// Read the matrix elements
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		// Calculate the expected sum (sum of the first row)
		int expectedSum = 0;
		for (int j = 0; j < n; j++) {
			expectedSum += matrix[0][j];
		}

		// Check rows
		for (int i = 0; i < n; i++) {
			int rowSum = 0;
			for (int j = 0; j < n; j++) {
				rowSum += matrix[i][j];
			}
			if (rowSum != expectedSum) {
				System.out.println("no");
				return;
			}
		}

		// Check columns
		for (int j = 0; j < n; j++) {
			int colSum = 0;
			for (int i = 0; i < n; i++) {
				colSum += matrix[i][j];
			}
			if (colSum != expectedSum) {
				System.out.println("no");
				return;
			}
		}

		// Check the forward diagonal
		int diagonalSum = 0;
		for (int i = 0; i < n; i++) {
			diagonalSum += matrix[i][i];
		}
		if (diagonalSum != expectedSum) {
			System.out.println("no");
			return;
		}

		// Check the backward diagonal
		diagonalSum = 0;
		for (int i = 0; i < n; i++) {
			diagonalSum += matrix[i][n - 1 - i];
		}
		if (diagonalSum != expectedSum) {
			System.out.println("no");
			return;
		}

		// If all checks pass, it is a magic square
		System.out.println("yes");

	}

}
