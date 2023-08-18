package day30;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDelete {

	public static void main(String[] args) {
		LinkedList<String> p = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			String prod = scanner.nextLine();
			p.add(prod);
		}
		System.out.println("Actual LinkedList:" + p);
		p.clear();
		System.out.println("After clear LinkedList:" + p);
	}

}
