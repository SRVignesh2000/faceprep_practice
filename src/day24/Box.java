package day24;

import java.util.Scanner;

public class Box {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();

		double perimeter = 4 * (l + b + h);
		double volume = l * b * h;

		System.out.println("Perimeter:" + (int) perimeter);
		System.out.println("Volume:" + (int) volume);
	}

}
