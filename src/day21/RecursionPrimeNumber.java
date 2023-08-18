package day21;

import java.util.Scanner;

public class RecursionPrimeNumber {

	public static boolean primeNumber(int n, int num) {
		if (n <= 1) {
			return true;
		}

		if (num % n == 0) {
			return false;
		} else {
			return primeNumber(n - 1, num);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int squareRoot = (int) Math.sqrt(num);

		boolean isPrime = primeNumber(squareRoot, num);

		if (isPrime) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

}
