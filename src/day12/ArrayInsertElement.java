package day12;

import java.util.Scanner;

public class ArrayInsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int position = sc.nextInt();

		// System.out.println(postion//);

		if (position < 0 || position > n || arr.length >= 20) {
			System.out.println("Invalid Input");
			return;
		}
		int number = sc.nextInt();

		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < newArr.length; i++) {
			if (i < position - 1) {// 2 < 3
				newArr[i] = arr[i];
			} else if (i == position - 1) {// 2 == 2
				newArr[i] = number;
			} else {
				newArr[i] = arr[i - 1];
			}
		}

		System.out.println("Array after insertion is:");
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}

	}

}
