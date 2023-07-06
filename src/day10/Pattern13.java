package day10;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = 0;

		for (int i = 1; i <= n + 1; i++) {
			for (int space = 1; space <= n + 1 - i; space++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j >= i) {
					System.out.printf("%d ", val);
					val--;
				} else if (j == 1) {
					val = 0;
					System.out.printf("%d ", val);
					val++;
				} else {
					System.out.printf("%d ", val);
					val++;
				}
			}
			System.out.println(" ");
		}
		val = 0;
		int s = 1;
		for (int i = n; i >= 1; i--) {
			for (int space = 1; space <= s; space++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1) {
					val = 0;
					System.out.printf("%d ", val);
					val++;
				} else if (j >= i) {
					System.out.printf("%d ", val);
					val--;
				} else {
					System.out.printf("%d ", val);
					val++;
				}
			}
			s++;
			System.out.println();
		}
		
		// method 2
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 0; i <= n; i++) {
//			for (int j = 1; j <= (n * 2) - i * 2; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			if (i >= 1) {
//				for (int j = i - 1; j >= 0; j--) {
//					System.out.print(j + " ");
//				}
//			}
//			System.out.println();
//		}
//		// reverse diamond
//		for (int i = n - 1; i >= 0; i--) {
//			for (int j = 1; j <= (n * 2) - i * 2; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			if (i >= 1) {
//				for (int j = i - 1; j >= 0; j--) {
//					System.out.print(j + " ");
//				}
//			}
//			System.out.println();
//		}

	}

}
