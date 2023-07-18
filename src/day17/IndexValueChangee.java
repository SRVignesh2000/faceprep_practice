package day17;

import java.util.Scanner;

public class IndexValueChangee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int index = sc.nextInt();
		for (int i = 0; i < name.length(); i++) {
			if (i == index) {
				continue;
			} else {
				System.out.print(name.charAt(i));
			}
		}

	}
}
