package mockTest;

public class TicTacToe {

	public static void main(String[] args) {

		char arr[][] = { { 'X', 'O', 'X' }, { 'O', 'X', 'O' }, { 'X', 'O', 'O' } };

		int value = -1;

		// Check rows and columns for a winner
		for (int i = 0; i < 3; i++) {
			int XWinner = 0;
			int YWinner = 0;
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == 'X') {
					XWinner++;
				} else if (arr[i][j] == 'O') {
					YWinner++;
				}
			}
			if (XWinner == 3) {
				value = 1;
				break;
			} else if (YWinner == 3) {
				value = 0;
				break;
			}
		}

		// Check columns for a winner
		if (value == -1) {
			for (int i = 0; i < 3; i++) {
				int XWinner1 = 0;
				int YWinner1 = 0;
				for (int j = 0; j < 3; j++) {
					if (arr[j][i] == 'X') {
						XWinner1++;
					} else if (arr[j][i] == 'O') {
						YWinner1++;
					}
				}
				if (XWinner1 == 3) {
					value = 1;
					break;
				} else if (YWinner1 == 3) {
					value = 0;
					break;
				}
			}
		}

		// Check diagonals for a winner
		if (value == -1) {
			int xw1 = 0;
			int yw1 = 0;
			int xw2 = 0;
			int yw2 = 0;
			for (int i = 0; i < 3; i++) {
				if (arr[i][i] == 'X') {
					xw1++;
				} else if (arr[i][i] == 'O') {
					yw1++;
				}
				if (arr[i][2 - i] == 'X') {
					xw2++;
				} else if (arr[i][2 - i] == 'O') {
					yw2++;
				}
			}
			if (xw1 == 3 || xw2 == 3) {
				value = 1;
			} else if (yw1 == 3 || yw2 == 3) {
				value = 0;
			}
		}

		if (value == 1) {
			System.out.println("X winner");
		} else if (value == 0) {
			System.out.println("Y winner");
		} else {
			System.out.println("No winner");
		}

	}

}
