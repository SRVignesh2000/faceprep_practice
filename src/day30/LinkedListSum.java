package day30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSum {

	public static void main(String args[]) {
		// type your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		LinkedList<String> a = new LinkedList<String>();

		for (int i = 1; i <= num; i++) {
			a.add(sc.next());
		}
		System.out.println("Actual LinkedList:" + a);

		ArrayList<String> b = new ArrayList<String>(a);
		int m = sc.nextInt();
		for (int i = 1; i <= m; i++) {
			b.add(sc.next());
		}
		System.out.println("After Copy:" + b);

	}

}
