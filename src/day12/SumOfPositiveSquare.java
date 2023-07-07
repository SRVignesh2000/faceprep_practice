package day12;

import java.util.Scanner;

public class SumOfPositiveSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		if (n < 0) {
			System.out.println("Invalid Input");
		}

		// Arrays.sort(arr);

		for (int i = 1; i <= n; i++) {
			
			int square = i * i;
			
			for (int element : arr) {
				if (element > 0) {
					if (square == element) {
						sum += element;
					}
				}
			}

		}
		System.out.println(sum > 0 ? sum : 0);

	}

}
