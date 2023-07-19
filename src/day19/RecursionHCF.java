package day19;

import java.util.Scanner;

public class RecursionHCF {

	public static int commonFactor(int num1, int num2) {

		if (num2 == 0) {
			return num1;
		} else {
			return commonFactor(num2, num1 % num2);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 27;

		int sum = 0;
		int result = commonFactor(a, b);
		System.out.println(result);
	}

}
