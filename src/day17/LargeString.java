package day17;

import java.util.Scanner;

public class LargeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// dont use bulit in methods. Use count method to count the length of the string.

		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		int length1 = name1.length();
		int length2 = name2.length();
		if (length1 > length2) {
			System.out.println(name1);
		} else {
			System.out.println(name2);
		}

	}

}
