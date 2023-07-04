package day07;

import java.util.Scanner;

public class DataMining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int even = 0;
		int odd = 0;

		while (number > 0) {
			int digit = number % 10;
			if (digit % 2 == 0) {
				even += digit;
			} else {
				odd += digit;
			}
			number /= 10;
		}

		if (even == odd) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
