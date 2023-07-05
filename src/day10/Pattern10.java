package day10;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int value = 2;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= n - 1; j++) {
					System.out.print(count);
				}
				System.out.print(value++);
				count++;
			} else {
				System.out.print(value++);
				for (int j = 1; j <= n - 1; j++) {
					System.out.print(count);
				}
				count++;
			}
			System.out.println();
		}

	}

}
