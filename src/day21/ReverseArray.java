package day21;

import java.util.Scanner;

public class ReverseArray {

	public static String reverse(int[] arr, int n) {
		if (n < 0) {
			return "";
		} else {
			return arr[n] + " " + reverse(arr, n - 1);
		}
	}

	public static void main(String args[]) {
		// fill your code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(reverse(arr, n - 1));
	}

}
