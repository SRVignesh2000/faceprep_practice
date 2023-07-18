package day16;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char character = name.charAt(i);
			if ((char) character >= 33 && (char) character <= 126) {
				count++;
			}
		}
		System.out.println("Total number of characters in a string: " + count);

	}

}
