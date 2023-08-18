package day26;

import java.util.Scanner;

public class ColorCube {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int name = sc.nextInt();

		System.out.println("Enter the side :");
		System.out.println("The square value is : " + (name * name));

		System.out.println("The cube value is : " + (name * name * name));

	}
}
