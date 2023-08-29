package recursion;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static boolean isPrime(int num, int divisor) {
		
		if (num == 2) {
			return true;
		}
		if (num % divisor == 0) {
			return false;
		} else if (divisor > Math.sqrt(num)) {
			return true;
		}
		return isPrime(num, divisor + 1);
	}

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean result = isPrime(num, 2);

		if (result) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}

	}

}
