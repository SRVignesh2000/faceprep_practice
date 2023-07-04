package day08;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int originalNumber = num;
		int sum = 0;

		while (num > 0) {
			
			int digit = num % 10;
			int fact = 1;
			

			if (digit == 0 || digit == 1) {
				fact = 1;
			}
			
			for (int i = 2; i <= digit; i++) {
				fact *= i;
			}
			sum += fact;
	
			num /= 10;
		}

		if (sum == originalNumber) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
