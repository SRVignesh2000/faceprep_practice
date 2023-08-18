package day30;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	public static void main(String args[]) {
		// type your code here
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer t = new StringTokenizer(input, " ");
		while (t.hasMoreTokens()) {
			list.add(t.nextToken());
		}
		System.out.println("List:" + list);
		System.out.print("ArrayList:" + list);
	}
}
