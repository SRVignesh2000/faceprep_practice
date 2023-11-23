package operators;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArrayWithGivenXOR {

	public static int countSubarraysWithXOR(int[] arr, int k) {
		int count = 0;
		int xor = 0;
		Map<Integer, Integer> xorCount = new HashMap<>();

		for (int num : arr) {
			xor ^= num;

			if (xor == k) {
				count++;
			}

			if (xorCount.containsKey(xor ^ k)) {
				count += xorCount.get(xor ^ k);
			}

			xorCount.put(xor, xorCount.getOrDefault(xor, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read n and k
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		// Read the array
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = countSubarraysWithXOR(arr, k);
		System.out.println(result);

		// Close the scanner
		scanner.close();
	}

}
