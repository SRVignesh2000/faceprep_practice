package day11;

import java.util.Arrays;
import java.util.Scanner;

public class MinScalar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Read the number of elements
		int n = scanner.nextInt();

		// Read the coordinates of v1 and v2
		int[] v1 = new int[n];
		int[] v2 = new int[n];
		for (int i = 0; i < n; i++) {
			v1[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			v2[i] = scanner.nextInt();
		}

		// Sort the vectors in ascending order
		Arrays.sort(v1);
		Arrays.sort(v2);

		// Reverse the second vector to get descending order
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			int temp = v2[i];
			v2[i] = v2[j];
			v2[j] = temp;
		}

		// Calculate the minimum scalar product
		int minScalarProduct = 0;
		for (int i = 0; i < n; i++) {
			minScalarProduct += v1[i] * v2[i];
		}

		// Output the result
		System.out.println(minScalarProduct);
		
		
		
		
		//method 2
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr1 = new int[n];
//		int[] arr2 = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr1[i] = sc.nextInt();
//		}
//		for (int i = 0; i < n; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		// ascending order for first arr1
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr1[i] > arr1[j]) {
//					int temp = arr1[i];
//					arr1[i] = arr1[j];
//					arr1[j] = temp;
//				}
//			}
//		}
//		// Decending order for second array
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr2[i] < arr2[j]) {
//					int temp = arr2[i];
//					arr2[i] = arr2[j];
//					arr2[j] = temp;
//				}
//			}
//		}
//		// multiply into array
//		int value = 0;
//		for (int i = 0; i < n; i++) {
//			value += arr1[i] * arr2[i];
//		}
//		System.out.print(value);

	}

}
