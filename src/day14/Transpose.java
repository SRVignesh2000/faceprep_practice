package day14;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		int arr[][] = new int[row][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				arr[i][j] = sc.nextInt();
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose matrix is:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

}
