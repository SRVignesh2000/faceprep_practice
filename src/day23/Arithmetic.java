package day23;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = n1 + n2;
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int substract = n3 - n4;
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		int multi = n5 * n6;
		int n7 = sc.nextInt();
		int n8 = sc.nextInt();
		int divide = n7 / n8;
		System.out.println(sum);
		System.out.println(substract);
		System.out.println(multi);
		System.out.println(divide);

	}
}
