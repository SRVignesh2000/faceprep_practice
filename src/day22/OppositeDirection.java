package day22;

import java.util.Scanner;

public class OppositeDirection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int distance = sc.nextInt();

		if (x < y) {
			System.out.println("Will never meet");
		} else {
			int totalSpeed = x - y;
			double ans = (double) distance / totalSpeed;
			System.out.println(ans);
		}

	}

}
