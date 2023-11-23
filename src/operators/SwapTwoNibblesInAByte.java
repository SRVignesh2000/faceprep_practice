package operators;

import java.util.Scanner;

public class SwapTwoNibblesInAByte {

	public static int swapNibbles(int n) {
		int firstNibble = (n & 0xF0) >> 4;
		int secondNibble = (n & 0x0F) << 4;
		return firstNibble | secondNibble;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			int N = sc.nextInt();
			if (N >= 0 && N <= 255) {
				int result = swapNibbles(N);
				System.out.println(result);
			} else {
				System.out.println("Input value should be in the range 0-255.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
		}
	}

}
