package day17;

import java.util.Scanner;

public class OddIgnorePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for (int i = 0; i < name.length(); i++) {
			if (i % 2 == 1) {
				continue;
			} else {
				System.out.print(name.charAt(i));
			}
		}

	}

}
