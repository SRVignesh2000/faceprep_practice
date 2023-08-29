package backTracking;

public class ManeuveringCave {

	public static int recur(int i, int j, int n, int m) {
		if (i < 0 || j < 0 || i > n || j > m) {
			return 0;
		}
		if (i == n && j == m) {
			return 1;
		}

		return recur(i, j + 1, n, m) + recur(i + 1, j, n, m);
	}

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		System.out.println(recur(0, 0, n - 1, m - 1));
	}

}
