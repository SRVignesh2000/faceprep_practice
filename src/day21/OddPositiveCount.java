package day21;

import java.util.Scanner;

public class OddPositiveCount {

	public static int odd(int[] arr, int n, int sum) {

		if (n < 0) {
			return sum;
		} else {
			if (arr[n] % 2 != 0 && arr[n] > 0) {
				sum += arr[n];
			}
			return odd(arr, n - 1, sum);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Sum = " + odd(arr, n - 1, sum));

	}

}
