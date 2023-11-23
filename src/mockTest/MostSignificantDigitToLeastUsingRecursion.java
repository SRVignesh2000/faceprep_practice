package mockTest;

import java.util.Scanner;

public class MostSignificantDigitToLeastUsingRecursion {
	
	
	// 123 to
	// 1
	// 2
	// 3

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printNumber(num);

	}

	public static void printNumber(int num) {
		if (num / 10 > 0) {
			printNumber(num / 10);
		}
		System.out.println(num % 10);
	}

	
	/*123 / 10 > 0
	 * 123/10 = 12
	 * 
	 * 12/10 = 1 >0
	 * 12 / 10 = 1
	 * 
	 * 1 / 10 >  0
	 * false 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
