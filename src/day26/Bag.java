package day26;

import java.util.Scanner;

public class Bag {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 6) {
			System.out.println("BAG : I choose Weekenders");
		} else {
			System.out.println("BAG : I choose Duffle");
		}

	}

}
