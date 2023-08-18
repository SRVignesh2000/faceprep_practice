package search;

import java.util.Scanner;

public class SmalletPositiveMissingNum {
	
//	input
//	6
//
//	4 2 0 -1 1 -3

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = findSmallestMissing(arr, n);
		System.out.println(result);
	}

	public static int findSmallestMissing(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			while (arr[i] > 0 && arr[i] != arr[arr[i] - 1]) {
				int temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

}
