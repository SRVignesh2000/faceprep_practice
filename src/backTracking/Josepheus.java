package backTracking;

import java.util.Scanner;

public class Josepheus {
	public static int josepheus(int n, int r) {
		if (n == 1) {
			return 0;
		}
		return ((josepheus(n - 1, r) + r) % n);
	}

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int skip = sc.nextInt();
		System.out.println(josepheus(n, skip) + 1);
		sc.close();
	}

	

}
