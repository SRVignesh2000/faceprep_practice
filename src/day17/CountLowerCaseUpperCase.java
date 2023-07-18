package day17;

import java.util.Scanner;

public class CountLowerCaseUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int upper = 0;
		int lower = 0;
		for (int i = 0; i < name.length(); i++) {
			int ascii = name.charAt(i);
			if (ascii >= 65 && ascii <= 90) {
				upper++;
			} else {
				lower++;
			}
		}
		System.out.println(lower);
		System.out.println(upper);

	}

}
