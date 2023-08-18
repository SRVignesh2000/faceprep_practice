package day27;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (isNeon(number)) {
			System.out.println("Neon");
		} else {
			System.out.println("Not Neon");
		}
	}

	public static boolean isNeon(int number) {
		int square = number * number;
		int sumOfDigits = 0;

		while (square > 0) {
			sumOfDigits += square % 10;
			square /= 10;
		}

		return sumOfDigits == number;
	}

}
