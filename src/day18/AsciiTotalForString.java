package day18;

import java.util.Scanner;

public class AsciiTotalForString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name = sc.next();

		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			int ascii = (int) name.charAt(i);
			sum += (int) ascii;
		}
		
		System.out.println(sum / n);

	}

}
