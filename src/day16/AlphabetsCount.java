package day16;

import java.util.Scanner;

public class AlphabetsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] freq = new int[str.length()];
		int i, j;
		char string[] = str.toCharArray();
		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;
					string[j] = '0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "-" + freq[i]);
		}

		
		// method 2
//		String name = "Perfect picture";
//
//		for (int i = 0; i < name.length(); i++) {
//			int count = 0;
//			for (int j = i + 1; j < name.length(); j++) {
//				if (name.charAt(i) == name.charAt(j)) {
//					count++;
////	                name = name.replaceAll(name.charAt(i)+"", name);
//				}
//			}
//			System.out.println(name.charAt(i) + "" + count);
//		}

	}

}
