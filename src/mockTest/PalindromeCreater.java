package mockTest;

import java.util.Scanner;

public class PalindromeCreater {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (str == null || "".equals(str.trim()) || str.length() < 1) {
			System.out.println("Invalid Input");
			return;
		}

		boolean flag = false;
		int index = -1;

		char last = str.charAt(str.length() - 1);

		index = str.lastIndexOf(last, str.length() - 2);

		if (index == -1) {
			index = str.length() - 1;
		}
		
		System.out.println(index);

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
