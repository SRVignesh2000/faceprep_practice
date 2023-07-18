package day15;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String b = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			b += name.charAt(i);
		}
		if (b.equals(name)) {
			System.out.print("Palindrome");
		} else {
			System.out.print("Not a Palindrome");
		}

	}

}
