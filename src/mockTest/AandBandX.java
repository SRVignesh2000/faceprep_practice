package mockTest;

import java.util.Scanner;

public class AandBandX {

	public static void main(String[] args) {

		/*
		 * 1 You are given two positive integers a and b. You also have a number x,
		 * which is initially set to 0. At first, you can add a to x any number of
		 * times. After that, you can divide x by b any number of times as long as x is
		 * divisible by b. Print YES if you can make x equal to 1, otherwise print NO.
		 * Input First line contains a single integer T - the number of test cases. Each
		 * of the next T lines contains two integer a and b. Output For each test, print
		 * YES if you can make x = 1 with the operations, otherwise NO. Constraints 1 <=
		 * T <= 106 1 <= A, B <= 109 Input 4 3 10 9 6 7 30 8 12 Output NO YES NO YES
		 * Explanation Test case 2: We initially have x set to 0. Add a=9 to x for 4
		 * times to make x equal to 36. And then divide x by b= 6 for 2 times to make x
		 * equal to 1. Test case 4: We initially have x set to 0. Add a=8 to x for 18
		 * times to make x equal to 144. And then divide x by b=12 for 2 times to make x
		 * equal to 1.
		 */
		

		// they give a and b. we consider x as 0. add a to x for any number of times.
		// Divide x with b any number of times until to get x as 1.
		// if x comes as 1 return YES
		// if 1 not comes return NO.

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 10
		int b = sc.nextInt(); // 2
		int x = 0;

		boolean flag = false;

		for (int i = 1; i <= b; i++) {

			x = a * i;

			System.out.println(x);

			while (x > 1) {

				System.out.println("x " + x);

				if (x % b == 0 && x / b > 1) {
					
					x = x / b;

				} else {
					
					break;
				}

			}

			if (x / b == 1 && x % b == 0) {
				System.out.println("YES");
				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("NO");
		}
		
		sc.close();

	}
	

}

//while ((x != 1 && x % b != 0) || x > 1) {
