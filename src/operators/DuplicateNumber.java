package operators;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;
		int repeat = 0;
		for (int i = 0; i < n + 1; i++) {
			int num = arr[i];
			for (int j = i + 1; j < n + 1; j++) {
				if (num == arr[j]) {
					count++;
					repeat = num;
					break;
				}

			}
			if (count > 0) {
				System.out.println(repeat);
				break;
			}
		}

	}

}
