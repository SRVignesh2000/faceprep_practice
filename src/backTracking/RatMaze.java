package backTracking;

import java.util.Scanner;

public class RatMaze {

	static int path = 0;

	public static void ratMaze(int[][] a, int i, int j, int n) {

		if (i < 0 || j < 0 || i > n || j > n || a[i][j] == 0) {
			return;
		}

		if (i == n && j == n) {
			path++;
		}

		a[i][j] = 0;

		ratMaze(a, i + 1, j, n);
		ratMaze(a, i, j + 1, n);
		ratMaze(a, i - 1, j, n);
		ratMaze(a, i, j - 1, n);

		a[i][j] = 1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		ratMaze(a, 0, 0, n - 1);
		System.out.println(path);

	}
}
