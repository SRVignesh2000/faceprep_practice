package day22;

import java.util.Scanner;

public class ArraysIndexExcep {

	public static void main(String args[]) {
		// Try out your code here
		Scanner	 sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		try {
			int num = sc.nextInt();
			int a = arr[num];
			System.out.println(a);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
		}

	}

}
