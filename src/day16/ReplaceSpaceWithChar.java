package day16;

import java.util.Scanner;

public class ReplaceSpaceWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		char chr = sc.next().charAt(0);
		sent = sent.replaceAll(" ", "\\" + chr);
		System.out.println(sent);

		// method 2
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String str1 = sc.nextLine();
//
//		str = str.replace(" ", str1);
//		System.out.println(str);
	}

}
