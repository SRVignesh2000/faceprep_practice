package day22;

import java.util.Scanner;

public class Mandays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int d1 = sc.nextInt();
		int h1 = sc.nextInt();
		int w1 = sc.nextInt();

		int n2 = sc.nextInt();
		int d2 = sc.nextInt();
		int h2 = sc.nextInt();

		// formula (n1 * d1 * h1)/w1 = (n2 * d2 * h2)/w2;

		double first = (n1 * d1 * h1);
		double second = n2 * d2 * h2;
		double ans = (second * w1) / first;

		System.out.println(ans);

	}

}
