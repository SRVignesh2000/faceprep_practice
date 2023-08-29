package recursion;

import java.util.Scanner;

public class BinaryConversion {

	public static String binary(int num) {
		if (num == 0) {
			return "0";
		}
		if (num == 1) {
			return "1";
		}
		return binary(num / 2) + num % 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ans = binary(num);
		System.out.println(ans);

	}

}
