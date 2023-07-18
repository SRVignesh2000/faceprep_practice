package day16;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ptn = s.split("[ ]+");
		int[] arr = new int[10];
		for (int i = 0; i < ptn.length; i++) {
			arr[i] = ptn[i].length();
		}
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 1; i < ptn.length; i++) {
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("Smallest word: " + ptn[minIndex]);
		System.out.println("Largest word: " + ptn[maxIndex]);

	}

}
