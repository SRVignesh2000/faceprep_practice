package day16;

import java.util.Scanner;

public class DivideString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		int n = scanner.nextInt();

		int length = inputString.length();
		int chars = length / n;

		if (length % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			System.out.println(n + " equal parts of given string are ");
			for (int i = 0; i < length; i += chars) {
				System.out.println(inputString.substring(i, i + chars));
			}
		}

//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		int parts = sc.nextInt();
//		int length = name.length() / parts;
//
//		if (name.length() % parts != 0) {
//			System.out.println("Sorry this string cannot be divided into " + parts + " equal parts.");
//		} else {
//			System.out.println(parts + " equal parts of given string are ");
//			for (int i = 0; i < name.length(); i++) {
//				if (i < length - 1) {
//					System.out.print(name.charAt(i));
//				} else if (i == length - 1) {
//					System.out.println(name.charAt(i));
//				} else if (length - 1 < i) {
//					System.out.print(name.charAt(i));
//				} else {
//					System.out.println();
//				}
//			}
//
//		}

	}

}
