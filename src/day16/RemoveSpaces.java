package day16;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String b = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				continue;
			} else {
				b += name.charAt(i);
			}
		}
		System.out.println(b);

	}

}
