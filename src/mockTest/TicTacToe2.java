package mockTest;

public class TicTacToe2 {

	public static char find(char[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				char value = arr[i][j];
				if (i == 1 && j == 1) {
					if (arr[i - 1][j - 1] == value && arr[i + 1][j + 1] == value) {
						return value;
					}
					if (arr[i + 1][j - 1] == value && arr[i - 1][j + 1] == value) {
						return value;
					}
					if (arr[i - 1][j] == value && arr[i + 1][j] == value) {
						return value;
					}
					if (arr[i][j - 1] == value && arr[i][j + 1] == value) {
						return value;
					}
				} else if (i == 1 && j != 1 && arr[i + 1][j] == value && arr[i - 1][j] == value) {
					return value;
				} else if (i != 1 && j == 1 && arr[i][j - 1] == value && arr[i][j + 1] == value) {
					return value;
				}
			}
		}

		return '-';
	}

	public static void main(String[] args) {
		char[][] arr = { { 'O', 'X', '0' }, { 'X', 'O', 'O' }, { ' ', 'X', 'O' } };

		char v = find(arr);
		System.out.print(v);
	}

}
