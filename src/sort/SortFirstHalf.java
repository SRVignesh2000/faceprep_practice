package sort;

import java.util.Scanner;

public class SortFirstHalf {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mid;
		if (n % 2 == 0) {
			mid = n / 2 - 1;
		} else {
			mid = n / 2;
		}

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == mid) {
					break;
				}
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
