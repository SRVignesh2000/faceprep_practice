package day15;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String lowerName = name.toLowerCase();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		for (int i = 0; i < lowerName.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (lowerName.charAt(i) == vowels[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
