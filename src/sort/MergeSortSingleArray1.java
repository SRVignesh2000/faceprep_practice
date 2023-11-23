package sort;

import java.util.Scanner;

public class MergeSortSingleArray1 {

	public static void merge(int[] a, int start, int mid, int end) {
		int left = mid - start + 1;
		int right = end - mid;
		int left_array[] = new int[left];
		int right_array[] = new int[right];
		
		for (int i = 0; i < right; i++) {
			right_array[i] = a[mid + 1 + i];
		}
		for (int i = 0; i < left; i++) {
			left_array[i] = a[start + i];
		}
		int i = 0, j = 0, k = start;
		while (i < right && j < left) {
			if (left_array[j] < right_array[i]) {
				a[k++] = left_array[j++];
			} else {
				a[k++] = right_array[i++];
			}
		}
		while (i < right) {
			a[k++] = right_array[i++];
		}
		while (j < left) {
			a[k++] = left_array[j++];
		}

	}

	public static void merge_sort(int[] a, int start, int end) {
		if (start < end)// 0<5 0<2 0<1
		{
			int mid = (start + end) / 2;// mid=(0+5)/2=2 mid=(0+2)/2=1 mid=(0+1)/2=0
			merge_sort(a, start, mid);// merge_sort(a,0,2)=>merge_sort(a,0,1)=>merge_sort(a,0,0);
			merge_sort(a, mid + 1, end);// merge_sort(a,1,2)
			merge(a, start, mid, end);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		// a={4,5,12,8,7,6};
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		// Merge Sort
		merge_sort(a, 0, n - 1);
		int y = 0;
		for (y = 0; y < n; y++)
			System.out.println(a[y]);
	}

}
