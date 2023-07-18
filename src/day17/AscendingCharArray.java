package day17;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char[] charArray = name.toCharArray();
		Arrays.sort(charArray);
		String sortedString = new String(charArray);
		System.out.println(sortedString);

	}

}
