package day16;

import java.util.Scanner;

public class AlphabetCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String = "anitha";

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		String alphabets = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < alphabets.length(); i++) {
			int count = 0;
			String b = "";
			for (int j = 0; j < name.length(); j++) {
				if (alphabets.charAt(i) == name.charAt(j)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(alphabets.charAt(i) + "" + count);
			}

		}

	}

}
