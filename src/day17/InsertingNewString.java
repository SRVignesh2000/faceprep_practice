package day17;

import java.util.Scanner;

public class InsertingNewString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String originalString = scanner.nextLine();

		String substring = scanner.nextLine();

		int index = scanner.nextInt();

		String modifiedString = originalString.substring(0, index) + substring + originalString.substring(index);

		System.out.println(modifiedString);

	}

}
