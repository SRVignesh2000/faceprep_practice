package day12;

import java.util.Scanner;

public class DistinctValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;

		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					count++;
					break;
				}
			}
		}

		int result = arr.length - count;
		System.out.println(result);

	}

}
