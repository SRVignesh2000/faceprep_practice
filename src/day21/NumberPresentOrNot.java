package day21;

import java.util.Scanner;

public class NumberPresentOrNot {

	public static String find(int[] arr, int n, int search) {

		if (arr[n] == search) {
			return arr[n] + "";
		} else if (n > 0) {
			return find(arr, n - 1, search);
		}
		return "The number is not present in the list";

	}

	public static void main(String args[]) {
		// fill your code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int search = sc.nextInt();

		System.out.println(find(arr, n - 1, search));
	}

}
