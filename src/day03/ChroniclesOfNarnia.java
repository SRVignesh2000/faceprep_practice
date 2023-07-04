package day03;

import java.util.Scanner;

public class ChroniclesOfNarnia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int[][] arr = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		int c = input.nextInt();
		int[][] arr1 = new int[a - 1][b];
		int d = 0;

		for (int i = 0; i < a; i++) {
			if (c != i) {
				for (int j = 0; j < b; j++) {
					arr1[d][j] = arr[i][j];
				}
				d++;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
