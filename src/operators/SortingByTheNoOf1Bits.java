package operators;

import java.util.Arrays;
import java.util.Scanner;

public class SortingByTheNoOf1Bits {

	public static int[] sortByBits(int[] arr) {
		// ok so for this enginner rule is applied where each number is updated by a the
		// number itself + number of bits in number*(10001) and then we will sort it and
		// then we will take the modulo.

		for (int i = 0; i < arr.length; i++) {
			arr[i] += Integer.bitCount(arr[i]) * 10001;
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] % 10001;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int[] ans = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		for (int n : sortByBits(arr)) {
			System.out.print(n + " ");
		}

	}

}
