package day09;

import java.util.Scanner;

public class SeriesXII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 9;
		int b = 11;
		int current;
		System.out.print(a + " " + b + " ");
		for (int i = 3; i <= n; i++) {
			current = a + b;
			System.out.print(current + " ");
			a = b;
			b = current;
		}

	}

}
