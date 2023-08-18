package day21;

import java.util.Scanner;

public class PrintOddOrEven {

	public static void oddEven(int n, int m) {
		if (n <= m) {
			System.out.print(n + " ");
			oddEven(n + 2, m);
		}
	}

	public static void main(String args[]) {
		// fill your code
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String type = "";

		if (a % 2 == 0) {
			type = "even";
		} else {
			type = "odd";
		}
		oddEven(a, b);
	}

}
