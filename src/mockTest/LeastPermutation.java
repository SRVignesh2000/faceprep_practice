package mockTest;

import java.util.Scanner;

public class LeastPermutation {

	// find the permutation of given number which each number is not in original
	// position and give the least number.
	// eg. if 123 is the number permutations are 123, 132, 213, 231, 312, 321.
	// not in original positions are 231, 312 so least is 231.
	
	
//	Given a sequence S = {1, 2, 3.... N} (2 <= N <= 11). Find the lexicographically smallest (earliest in dictionary order) derangement of S.     
//
//			A derangement of S is any permutation of S is such that, no two elements in S and its permutation occur in its same position.

	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		int n = value.nextInt();
		int[] arr = new int[n];

		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}
		
		int length;
		
		if(n % 2 == 0) {
			length = n-1;
		} else {
			length = n-2;
		}

		for (int k = 1; k <= length; k = k + 2) {
			int temp = arr[k];
			arr[k] = arr[k - 1];
			arr[k - 1] = temp;
		}

		if (n % 2 != 0) {
			int temp = arr[n - 1];
			arr[n - 1] = arr[n - 2];
			arr[n - 2] = temp;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
