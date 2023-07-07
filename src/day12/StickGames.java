package day12;

import java.util.Scanner;

public class StickGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int sum = n + m;
		int product = n * m;
		int total = sum + product;

		if (total % 2 != 0) {
			System.out.println("Arun Gupta");
		} else {
			System.out.println("Mani Iyer");
		}

		// method -2 // if any one number comes in odd result will be gupta, even means mani
//		if (n % 2 != 0 || m % 2 != 0) {
//			System.out.println("Arun Gupta");
//		} else {
//			System.out.println("Mani Iyer");
//		}

	}

}
