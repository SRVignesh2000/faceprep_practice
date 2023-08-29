package recursion;

import java.util.Scanner;

public class SumOfNumbers {

	public static int sumOfnum(int num) {
		if (num == 0) {
			return 0;
		}
		return num % 10 + sumOfnum(num / 10);
	}

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The sum of digits in " + num + " is " + sumOfnum(num));
	}
}
