package day30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkListClone {

	public static void main(String args[]) {
		// type your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		LinkedList<String> al = new LinkedList<String>();
		for (int i = 0; i < num; i++) {
			al.add(sc.next());
		}

		System.out.println("Actual LinkedList:");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Cloned LinkedList:");
		Iterator<String> itr2 = al.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
