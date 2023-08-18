package day21;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static int total(int n, int sum) {
		if (n < 0) {
			return sum;
		} else {
			if (n > 0) {
				sum += n;
			}
			return total(n - 1, sum);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		System.out.println(total(num, sum));
	}

}
