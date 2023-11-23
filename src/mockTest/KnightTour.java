package mockTest;

public class KnightTour {

	public static int count = 1;

	public static void main(String[] args) {

		int n = 5;
		int[][] arr = new int[n][n];

		boolean found = knightTour(n, 0, 0, arr);

		if (found) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean knightTour(int n, int a, int b, int[][] arr) {

		if (a < 0 || b < 0 || a > n - 1 || b > n - 1 || arr[a][b] != 0) {
			return false;
		}

		if (count == n * n) {
			arr[a][b] = count;
			return true;
		}

		if (arr[a][b] == 0) {
			arr[a][b] = count++;

			if (
					knightTour(n, a - 1, b - 2, arr) || knightTour(n, a - 1, b + 2, arr) || knightTour(n, a + 1, b - 2, arr)
					|| knightTour(n, a + 1, b + 2, arr) || knightTour(n, a - 2, b - 1, arr)
					|| knightTour(n, a - 2, b + 1, arr) || knightTour(n, a + 2, b - 1, arr)
					|| knightTour(n, a + 2, b + 1, arr)) {

				return true;
			}
			
			arr[a][b] = 0;
			count--;

		}
		return false;


	}

}
