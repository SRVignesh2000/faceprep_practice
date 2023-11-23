package mockTest;

import java.util.Scanner;

public class BulbSumOnOff {

//	There are N bulbs that are initially off. In the first round, you turn ON all the bulbs, then you turn off every
//
//	second bulb in the second round. On the third round, you toggle every third bulb (turning ON if it's OFF or vice-
//	versa). For the Ith round, you toggle every Ith bulb. For the Nth round, you only toggle the last bulb.
//
//	Return the number of bulbs that are ON after the N rounds.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;

		for (int i = 1; i * i < n; i++) {

			count++;

		}

		System.out.println(count);

	}

}
