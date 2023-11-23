package operators;

import java.util.Scanner;

public class SetKthBit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read input values
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		// Calculate the mask to set the Kth bit
		int mask = 1 << K;

		// Set the Kth bit by performing a bitwise OR operation
		int result = N | mask;

		// Print the updated number
		System.out.println(result);

		// Close the scanner
		scanner.close();
	}
}
