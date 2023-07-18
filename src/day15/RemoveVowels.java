package day15;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String lowerName = name.toLowerCase();
		String b = "";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < lowerName.length(); i++) {
			int count = 0;
			for (int j = 0; j < vowels.length; j++) {
				if (lowerName.charAt(i) == vowels[j]) {
					count++;
				}
			}
			if (count == 0) {
				b += name.charAt(i);
			}
		}
		System.out.println(b);

	}

}
