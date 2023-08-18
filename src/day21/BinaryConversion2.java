package day21;

import java.util.Scanner;

public class BinaryConversion2 {
	//input 10 , 3

	public static String binary(int n, int m) {

		if (n < m) {
			return "" + n + "";
		} else {
			return binary(n / m, m) + "" + n % m;
		}

	}

	public static void main(String args[]) {
		// fill your code
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter the value of n");
		System.out.println("Enter the base to which you want to convert");
		System.out.println(binary(a, b));
	}
}
