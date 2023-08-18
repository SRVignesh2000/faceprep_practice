package day21;

import java.util.Scanner;

public class StringReverse {

	public static String reverse(String name, int n) {

		if (n < 0) {
			return "";
		} else {
			return name.charAt(n) + "" + reverse(name, n - 1);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int length = name.length();

		System.out.println(reverse(name, length - 1));
	}

}
