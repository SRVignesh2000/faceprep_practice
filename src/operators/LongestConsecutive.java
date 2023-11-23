package operators;

import java.util.Scanner;

public class LongestConsecutive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // Number of test cases

		while (T-- > 0) {
			int N = scanner.nextInt(); // Input number
			int longestConsecutiveOnes = findLongestConsecutiveOnes(N);
			System.out.println(longestConsecutiveOnes);
		}

		scanner.close();
	}

	public static int findLongestConsecutiveOnes(int N) {
		String binary = Integer.toBinaryString(N); // Convert N to binary representation

		int maxConsecutiveOnes = 0;
		int currentConsecutiveOnes = 0;

		for (char c : binary.toCharArray()) {
			if (c == '1') {
				currentConsecutiveOnes++;
				maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
			} else {
				currentConsecutiveOnes = 0;
			}
		}

		return maxConsecutiveOnes;
	}

}
