package operators;

import java.util.Scanner;

public class MinimumChangeSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		generateBitPatterns(N);
	}

	public static void generateBitPatterns(int N) {
		for (int i = 0; i < (1 << N); i++) {
			int val = i ^ (i >> 1);
			String binary = Integer.toBinaryString(val);
			while (binary.length() < N) {
				binary = "0" + binary;
			}
			System.out.print(binary + " ");
		}
	}

}
