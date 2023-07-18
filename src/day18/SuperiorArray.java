package day18;

import java.util.Scanner;

public class SuperiorArray {

	public static int FindNumberOfSuperiorElements(int[] arr, int n) {
		int max = arr[n - 1];
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (max < arr[n - i - 1]) {
				max = arr[n - i - 1];
				count++;
			}
		}
		// fill your code here
		return count;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int x = FindNumberOfSuperiorElements(arr, n);
		System.out.print(x);
	}

}
