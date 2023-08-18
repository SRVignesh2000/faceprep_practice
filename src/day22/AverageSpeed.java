package day22;

import java.util.Scanner;

public class AverageSpeed {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		double result = (double) (2 * x * y) / (x + y);
		System.out.println(result);

	}

}
