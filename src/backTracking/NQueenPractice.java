package backTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueenPractice {

	public static List<Integer> newArr = new ArrayList<Integer>();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int j = 0; j < n; j++) {
			clearArray(arr, n);
			change(0, j, arr, n);
		}

		System.out.println(newArr);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void queen(int i, int j, int[][] arr, int n) {
		if (j > n || i > n || i < 0 || j < 0 || arr[i][j] == 0) {
			return;
		}

		if (arr[i][j] != 0) {
			newArr.add(j + 1);
			return;
		}

		if (arr[i][j] == 0) {
			return;
		}


		for (int jj = j + 1; jj < n; jj++) {
			change(i, jj, arr, n);
			queen(i, jj, arr, n);

		}
	}

	public static void change(int i, int j, int[][] arr, int n) {
		int r = i;
		int c = j;

		if (arr[i][j] == 0) {
			return;
		}

		if (c == r) {
			for (int ii = i; ii < n; ii++) {
				for (int jj = j + 1; jj < n; jj++) {
					if (ii == r || jj == c || ii == jj) {
						arr[ii][jj] = 0;
					}
				}
			}
		} else if (i > j) {
			for (int ii = i + 1; ii < n; ii++) {
				for (int jj = j + 1; jj < n; jj++) {
					if (ii == r || jj == c || ii > jj) {
						arr[ii][jj] = 0;
					}
				}
			}
		} else {
			for (int ii = i + 1; ii < n; ii++) {
				for (int jj = j + 1; jj < n; jj++) {
					if (ii == r || jj == c || ii < jj) {
						arr[ii][jj] = 0;
					}
				}
			}
		}

	}

	public static void clearArray(int[][] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = 1;
			}
		}
	}

}
