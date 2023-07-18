package day18;

import java.util.Scanner;

public class NUmberModulusCount {

	public static int countDigits(int num) {
		int original = num;
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return (original % count);
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.print(countDigits(num));
	}

}
