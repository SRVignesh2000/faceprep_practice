package sort;

import java.util.*;

public class QuickSort {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static int pivott(int[] arr, int start, int end) {

		int pivott = arr[end], i = start - 1, j;
		for (j = start; j < end;) {
			if (arr[j] < pivott) {
				i++;
				swap(arr, i, j);
				j++;
			} else {
				j++;
			}
		}
		swap(arr, i + 1, end);
		return (i + 1);
	}

	public static void q_s(int[] arr, int start, int end) {
		if (start < end) {
			int mid = pivott(arr, start, end);
			q_s(arr, start, mid - 1);
			q_s(arr, mid + 1, end);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		q_s(arr, 0, n - 1);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}

}
