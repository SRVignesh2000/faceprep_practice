package day11;

import java.util.Scanner;

public class OddEvenMixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int even = 0;
		int odd = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		if (even == n) {
			System.out.println("The array is Even");
		} else if (odd == n) {
			System.out.println("The array is Odd");
		} else {
			System.out.println("The array is Mixed");
		}

	}

}
