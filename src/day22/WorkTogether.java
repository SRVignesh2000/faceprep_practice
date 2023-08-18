package day22;

import java.util.Scanner;

public class WorkTogether {

	public static int lcm(int a, int b, int d) {

		if (d % a == 0 && d % b == 0) {
			return d;
		} else {
			return lcm(a, b, d + 1);
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int lcm = lcm(a, b, a > b ? a : b);
		int effiA = lcm / a;
		int effiB = lcm / b;
		int totalEffi = effiA + effiB;
		double ans = (double) lcm / totalEffi;

		System.out.println(ans);
	}

}
