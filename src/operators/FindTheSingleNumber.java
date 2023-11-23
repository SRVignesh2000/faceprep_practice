package operators;

import java.util.Scanner;

public class FindTheSingleNumber {

	public static int findSingleNumber(int[] nums) {
		int result = 0;

		// Iterate through each bit position (32 bits for integers)
		for (int i = 0; i < 32; i++) {
			int count = 0;
			int mask = 1 << i;

			// Count the number of elements with '1' at the current bit position
			for (int num : nums) {
				if ((num & mask) != 0) {
					count++;
				}
			}

			// If the count is not a multiple of three, set the bit in the result
			if (count % 3 != 0) {
				result |= mask;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read n
		int n = scanner.nextInt();

		// Read the array
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		int result = findSingleNumber(nums);
		System.out.println(result);

		// Close the scanner
		scanner.close();
	}

}
