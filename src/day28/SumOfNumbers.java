package day28;

import java.util.*;

class SumOfDigits {
	private int num;

	public SumOfDigits(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}

public class SumOfNumbers {
	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		SumOfDigits s = new SumOfDigits(num);
		int number = s.getNum();
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println(sum);
	}
}
