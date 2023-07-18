package day16;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int minimum = Integer.MAX_VALUE;
		int currentNumber = 0;
		boolean isNumber = false;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c >= '0' && c <= '9') {
				currentNumber = currentNumber * 10 + (c - '0');
				isNumber = true;
			} else {
				if (isNumber && currentNumber < minimum) {
					minimum = currentNumber;
				}
				currentNumber = 0;
				isNumber = false;
			}
		}
		if (isNumber && currentNumber < minimum) {
			minimum = currentNumber;
		}
		System.out.println(minimum);

		// method 2

//		String name = "12pro4gra90m";
//		String ans = "";
//
//		String a = name.replaceAll("[a-zA-Z]", " ");
//
//		for (int i = 0; i < name.length(); i++) {
//			String b = "";
//
//			if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
//				b += name.charAt(i);
//			} else {
//				b += ",";
//			}
//			ans += b;
//		}
//
//		String[] arr = a.split(" ");
//		for (int i = 0; i < arr.length; i++) {
//
//		}
//
////		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[0]);

	}

}
