package day18;

import java.util.Scanner;

public class FindTotalDistance {
//	
//	Input
//
//	input1: 5
//
//	input2: 10 11 7 12 14

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < n - 1) {
				sum += Math.abs(arr[i] - arr[i + 1]);
			}
		}
		System.out.println(sum);
	}

}
