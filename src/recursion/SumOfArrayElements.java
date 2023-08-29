package recursion;

import java.util.Scanner;

public class SumOfArrayElements {

	public static int sumOfElements(int[] arr, int n) {
		if (n == 0) {
			return arr[0];
		}
		return arr[n] + sumOfElements(arr, n - 1);
	}

	public static void main(String args[]) {
		// fill your code;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The sum of the elements in the array is " + sumOfElements(arr, n - 1));
	}

}
