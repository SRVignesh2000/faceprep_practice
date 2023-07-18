package day14;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		int arr[][] = new int[row][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		boolean isDiagonal = true;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i != j && arr[i][j] != 0) {
					isDiagonal = false;
					break;
				}
			}
		}

		if (isDiagonal) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
