package day10;

import java.util.Scanner;

public class Pattern09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = n * (n + 1);

		int count = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= total / 2; j++) {

				for (int k = 1; k < n; k++) {
					System.out.print(j + "*");
					count++;
				}

			}

			System.out.println();
		}

		// method 2 need to word
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int total = n * (n + 1);
//
//		int count = 1;
//
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= total / 2; j++) {
//
//				for (int k = 1; k < n; k++) {
//					System.out.print(j + "*");
//					count++;
//				}
//
//			}
//
//			System.out.println();
//		}

	}

}
