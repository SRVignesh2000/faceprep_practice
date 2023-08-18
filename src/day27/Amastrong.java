package day27;

import java.util.*;

public class Amastrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (isArmstrong(number)) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

	public static boolean isArmstrong(int number) {
		int num = number;
		int numDigits = String.valueOf(num).length();
		int armstrongSum = 0;

		while (num > 0) {
			int digit = num % 10;
			armstrongSum += Math.pow(digit, numDigits);
			num /= 10;
		}

		return armstrongSum == number;
	}

}
