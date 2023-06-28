package day03;

import java.util.Scanner;

public class AddFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int sum = input % 10;
		int result = input / 10;
		int result1 = sum + result;
		System.out.println("Alice must go in path-" + result1);
	}

}
