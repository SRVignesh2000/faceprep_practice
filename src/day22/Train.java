package day22;

import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int totalSpeed = x + y;
		double time = (double) distance / totalSpeed;

		System.out.println((double) time * z);

	}

}
