package operators;

import java.util.Scanner;

public class BitDifference {

	static int hex(int a, int b) {
		int out = a ^ b;
		int countX = Integer.bitCount(out);

		return countX;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();

		int co = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				co += hex(a[i], a[j]);
			}
		}

		System.out.println(co);
	}

}
