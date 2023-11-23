package sort;

import java.util.*;

public class QuickSort {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	
	// 1 8 3 9 5 4 7
	// i = -1; j = 0; //1 < 7 // true // i =0; // swap(arr, 0 , 0) // 1 8 3 9 5 4 7 // j = 1;
	// 8 < 7 // false // i = 0; j = 2;
	// 3 < 7 // true // i = 1; swap( arr, 1, 2) // 1 3 8 9 5 4 7 // j = 3
	// 9 < 7 // false // i = 1 // j = 4;
	// 5 < 7 // true // i = 2 // swap(arr, 2, 4) // 1 3 5 9 8 4 7 // j = 5
	// 5 < 7 // true // i = 3 // swap(arr, 3, 5) // 1 3 5 4 8 9 7 // j = 6
	// loop break 6 < 6
	// swap(arr, 3 +1, 6) // 1 3 5 4 7 9 8
	// return i+1 // i = 4
	
	
	// q_s(arr, 0, 4-1)
	// pivott = arr[3]=4, i=-1, j=0
	// 1 < 4 // i = 0 // swap(arr, 0, 0) // 1 3 5 4 7 9 8 // j = 1;
	// 3 < 4 // i = 1 // swap(arr, 1, 1) // 1 3 5 4 7 9 8 // j =2;
	// 5 < 4 // false // i = 1 , j = 3
	// loop break; 3 < 3
	// swap(arr, 1+1, 3) // 1 3 4 5 7 9 8
	// return i+1 = 1+1 = 2
	
	

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
//			System.out.println(arr[mid]);
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
