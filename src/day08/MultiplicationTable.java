package day08;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("The multiplication table of " + n + " is");
		int i = 1;
		while (i <= m) {
			int ans = i * n;
			System.out.println(i + "*" + n + "=" + ans);
			i++;
		}

	}

}
