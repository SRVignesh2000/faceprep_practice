package operators;

import java.util.Scanner;

public class BitWiseOperators {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count = 0;

		while (n > 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}

		if (count == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
