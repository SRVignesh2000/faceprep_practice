package day16;

import java.util.Scanner;

public class ReverseEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String name1 = sc.nextLine();
		String b = "";

		for (int i = 0; i < name1.length(); i++) {
			b += name1.charAt(name1.length() - i - 1);
		}
		if (name.equals(b)) {
			System.out.println("It is same");
		} else {
			System.out.println("It is not same");
		}

	}

}
