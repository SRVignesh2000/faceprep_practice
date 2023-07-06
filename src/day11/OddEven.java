package day11;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int odd = 0;
		int even = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Odd: " + odd);
		System.out.println("Even: " + even);

	}

}
