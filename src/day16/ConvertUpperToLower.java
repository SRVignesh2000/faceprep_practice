package day16;

import java.util.Scanner;

public class ConvertUpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		StringBuilder converted = new StringBuilder();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if (Character.isUpperCase(ch)) {
				converted.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				converted.append(Character.toUpperCase(ch));
			} else {
				converted.append(ch);
			}
		}
		System.out.println("String after case conversion : " + converted.toString());

	}

}
