package mockTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AutoBiography {

	public static void main(String[] args) {
		
		// input 1234
		// there is 1-0, 2-1s, 3-2s, 4-3s
		
		// sample input 21200
		Scanner in = new Scanner(System.in);
		String n = in.next();
		
		Set<Character> arr = new HashSet<>();
		
		for (int i = 0; i < n.length(); i++) {
			arr.add(n.charAt(i));
		}
		
		boolean find = false;
		int total = 0;
		
		System.out.println(arr);
		
		
		for (int i = 0; i < n.length(); i++) {

			int count = 0;
			for (int j = 0; j < n.length(); j++) {
				if (i == Character.getNumericValue(n.charAt(j))) {
					count++;
				}
			}

			if (Character.getNumericValue(n.charAt(i)) != count) {
				find = true;
				break;
			}
		}

		if (!find) {
			System.out.println(arr.size());
		} else {
			System.out.println("0");
		}
	}

}
