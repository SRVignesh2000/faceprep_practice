package day07;

import java.util.Scanner;

public class StarHashPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String character = "";
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				character += "*";
				System.out.println(character);
			} else {
				character += "#";
				System.out.println(character);
			}
		}

	}

}
