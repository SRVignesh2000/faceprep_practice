package day10;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input hello
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		int length = input1.length();
		int middle = length / 2;

		String firstHalf = input1.substring(0, middle);
		String secondHalf = input1.substring(middle);
		String input = secondHalf + firstHalf;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(input.charAt(j));
			}
			System.out.println();

		}
	}

}
