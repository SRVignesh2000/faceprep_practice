package sort;

import java.util.Arrays;

public class CountingSort {

	public static int findMax(int[] arr, int n) {
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int n = 12;
		int[] arr = { 3, 1, 5, 4, 3, 2, 1, 6, 9, 1, 7, 2 };

		// step - 1
		int max = findMax(arr, n);

		int[] arr2 = new int[max + 1];

		for (int i = 0; i <= max; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (i == arr[j]) {
					count++;
				}
			}
			arr2[i] = count;
		}

		// step - 2
		for (int i = 1; i <= max; i++) {
			arr2[i] = arr2[i - 1] + arr2[i];
		}

		// step - 3
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			int index = arr2[arr[i]] - 1;
			ans[index] = arr[i];
			arr2[arr[i]] = arr2[arr[i]] - 1;
		}

		System.out.println(Arrays.toString(ans));
	}

}
