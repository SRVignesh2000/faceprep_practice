package operators;

import java.util.Scanner;

public class BitDifference2 {

	public static int countSetBits(int x) {
		int count = 0;
		while (x > 0) {
			count += x & 1;
			x >>= 1;
		}
		return count;
	}

	public static int totalBitDifference(int[] A) {
		int MOD = 1000000007;
		int result = 0;
		int N = A.length;

		for (int i = 0; i < 32; i++) { // 32 bits for integers
			int countOnes = 0;
			for (int j = 0; j < N; j++) {
				if ((A[j] & (1 << i)) != 0) {
					countOnes++;
				}
			}
			int countZeros = N - countOnes;
			result = (result + (countOnes * countZeros * 2)) % MOD;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.out.print("Enter the number of elements (N): ");
		int N = scanner.nextInt();

		int[] A = new int[N];
		// System.out.println("Enter the elements:");

		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}

		int result = totalBitDifference(A);
		System.out.println(result);

		// Close the scanner to release resources
		scanner.close();
	}

}
