package day10;

import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(0);
		int count = 0;
		int loop = 0;

		for (int i = 1; i <= num; i++) {
			int sum = i + 1;

			for (int k = sum - 1; k <= sum; k++) {
				if (sum % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
				count++;
				for (int j = 1; j <= count; j++) {

					if (sum % 2 == 0) {
						if (j % 2 == 0) {
							System.out.print(1 + " ");
						} else {
							System.out.print(0 + " ");
						}
					} else {

						if (j % 2 == 0) {
							System.out.print(0 + " ");
						} else {
							System.out.print(1 + " ");
						}
					}

				} // j loop
				System.out.println();
				loop++;
				if (loop == num - 1) {
					return;
				} // j loop
			} // k loop
		} // i loop

	}

}
