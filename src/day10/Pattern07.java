package day10;

import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(1 + " ");
			for (int j = 1; j < i; j++) {
				if (j % 2 != 0) {
					System.out.print(0 + " ");
				} else {
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}

	}

}
