package day09;

import java.util.Scanner;

public class SeriesVII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1, b = 2;
		System.out.print(a + " " + b + ".0" + " ");
		for (int i = 3; i <= n; i++) {
			if (i % 2 == 1) {
				a = a * 3;
				System.out.print(a + ".0" + " ");
			} else {
				b = b * 3;
				System.out.print(b + ".0" + " ");
			}
		}

		// method 2
//		int n = 6;
//		float a = 1.0f;
//		System.out.println(1 + " ");
//
//		for (int i = 1; i <= n; i++) {
//			if (i % 2 == 1) {
//				a = a * 2;
//				System.out.print(a + " ");
//			} else {
//				a = a * 1.5f;
//				System.out.print(a + " ");
//			}
//		}

	}

}
