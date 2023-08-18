package day26;

import java.util.Scanner;

public class SimpleInterese {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println("Principle amount : " + num1);
		System.out.println("No.Of.Years : " + num2);

		System.out.println("Rate of interest : " + num3);

		int simpleInterest = (num1 * num3 * num2) / 100;
		System.out.println("Simple Interest : " + simpleInterest);

	}

}
