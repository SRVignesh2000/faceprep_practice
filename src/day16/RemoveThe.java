package day16;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveThe {

	public static void main(String[] args) {

		// String name = "remove the occurrence of the word from entered string";
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String b = "";
		String[] arr = name.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("the")) {
				continue;
			} else {
				b += arr[i] + " ";
			}
		}
		System.out.println(b);

	}

}
