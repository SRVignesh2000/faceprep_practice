package day19;

import java.util.Scanner;

public class RecursionSumFinder {

	public static int countFinder(int num, int sum) {

		if (num > 0) {
			sum += num % 10;
			return countFinder(num / 10, sum);

		}
		return sum;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 432;
		int sum = 0;
		int result = countFinder(num, sum);
		System.out.println(result);
	}

}
