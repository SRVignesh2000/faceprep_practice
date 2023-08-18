package day21;

import java.util.Scanner;

public class RowToColumn {

	public static void column(int n) {

		if (n < 10) {
			System.out.println(n % 10);
		} else {
			column(n / 10);
			System.out.println(n % 10);
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		column(num);
	}

}
