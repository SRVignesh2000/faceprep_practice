package mockTest;

public class TicTacToe1 {

	public static void main(String[] args) {
		char arr[][] = { { 'X', 'O', 'X' }, { 'O', 'X', 'O' }, { 'X', 'O', 'O' } };

		int value = checkWinner(arr);

		if (value == 1) {
			System.out.println("X winner");
		} else if (value == 0) {
			System.out.println("Y winner");
		} else {
			System.out.println("No winner");
		}
	}

	public static int checkWinner(char[][] arr) {
		for (int i = 0; i < 3; i++) {
			// Check rows
			if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
				if (arr[i][0] == 'X') {
					return 1; // X wins
				} else if (arr[i][0] == 'O') {
					return 0; // O wins
				}
			}

			// Check columns
			if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
				if (arr[0][i] == 'X') {
					return 1; // X wins
				} else if (arr[0][i] == 'O') {
					return 0; // O wins
				}
			}
		}

		// Check diagonals
		if ((arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) || (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0])) {
			if (arr[1][1] == 'X') {
				return 1; // X wins
			} else if (arr[1][1] == 'O') {
				return 0; // O wins
			}
		}

		return -1; // No winner
	}

}
