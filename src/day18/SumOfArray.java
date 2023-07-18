package day18;

import java.util.Scanner;

public class SumOfArray {

	public static int getarraysum(int[] arr, int len) {
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int x = getarraysum(arr, n);
		System.out.print(x);
	}

}
