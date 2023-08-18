package day21;

import java.util.Scanner;

public class RecursionBinaryConverter {

	public static String binary(int n) {

		if (n == 0) {
			return "0";
		} else if (n == 1) {
			return "1";
		} else {
			return binary(n / 2) + "" + n % 2;
		}
	}

	public static void main(String args[]) {
		// fill your code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(binary(n));
	}

	// method 2
//	public static String decimel(int num, int base, String b) {
//
//		if (num == 0) {
//			return "0";
//		}
//
//		if (num < base) {
//			return num + b;
//		} else {
//			int a = num % base;
//			b = a + b;
//			num = num / base;
//			return decimel(num, base, b);
//		}
//
//	}
//
//	public static void main(String args[]) {
//		int num = 56;
//		int base = 2;
//		String b = "";
//
//		System.out.println(decimel(num, base, b));
//
//	}
}
