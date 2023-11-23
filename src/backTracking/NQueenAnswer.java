package backTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueenAnswer {

	public static List<int[]> solveNQueens(int n) {
		List<int[]> solutions = new ArrayList<>();
		int[] board = new int[n];
		solveNQueensUtil(n, 0, board, solutions);
		return solutions;
	}

	private static void solveNQueensUtil(int n, int row, int[] board, List<int[]> solutions) {
		if (row == n) {
			solutions.add(board.clone());
			return;
		}

		for (int col = 0; col < n; col++) {
			if (isSafe(row, col, board)) {
				board[row] = col;
				solveNQueensUtil(n, row + 1, board, solutions);
				board[row] = 0;
			}
		}
	}

	private static boolean isSafe(int row, int col, int[] board) {
		for (int prevRow = 0; prevRow < row; prevRow++) {
			if (board[prevRow] == col || Math.abs(board[prevRow] - col) == Math.abs(prevRow - row)) {
				return false;
			}
		}
		return true;
	}

	public static void printSolutions(List<int[]> solutions) {
		for (int[] solution : solutions) {
			System.out.print("[");
			for (int col : solution) {
				System.out.print(col + 1 + " ");
			}
			System.out.print("]");
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("[1 ]");
		} else if (n > 1 && n < 4) {
			System.out.println("-1");
		} else {
			List<int[]> solutions = solveNQueens(n);
			printSolutions(solutions);
		}
	}

}
