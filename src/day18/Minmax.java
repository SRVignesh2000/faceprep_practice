package day18;

import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample Input:
//		4
//
//		9 5 0 11

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int min = max;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println(max + min);

	}

}
