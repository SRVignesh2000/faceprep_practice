package recursion;

import java.util.Scanner;

public class ConvertToTheBaseGiven {

	public static String convertBaseTo(int num, int base) {
		if (num == 0) {
			return "";
		} else {

			return convertBaseTo(num / base, base) + num % base;
		}
	}

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		String ans = convertBaseTo(num, base);
		System.out.println("Enter the value of n");
		System.out.println("Enter the base to which you want to convert");
		System.out.println(ans);
	}

}
