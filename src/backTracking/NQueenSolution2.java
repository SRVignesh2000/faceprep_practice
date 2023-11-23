package backTracking;

public class NQueenSolution2 {

	public static void main(String[] args) {
		int n = 4;
		char[][] board = new char[n][n];
		solveNQueens(0, board);
	}

	public static void solveNQueens(int row, char[][] board) {
		int n = board.length;
		if (row == n) {
			printBoard(board); // Print the board when a valid arrangement is found
			return;
		}

		for (int col = 0; col < n; col++) {
			if (isSafe(row, col, board)) {
				board[row][col] = 'Q';
				solveNQueens(row + 1, board);
				board[row][col] = '.';
			}
		}
	}

	public static boolean isSafe(int row, int col, char[][] board) {
		int n = board.length;

		// Check if there is a queen in the same column
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}

		// Check if there is a queen in the upper diagonal
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		// Check if there is a queen in the lower diagonal
		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		return true;
	}

	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'Q') {
					System.out.print("Q ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
