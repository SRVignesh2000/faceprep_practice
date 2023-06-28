package day04;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > 0 && b > 0) {
			System.out.println("Ist Quadrant");
		} else if (a < 0 && b > 0) {
			System.out.println("IInd Quadrant");
		} else if (a < 0 && b < 0) {
			System.out.println("IIIrd Quadrant");
		} else if (a > 0 && b < 0) {
			System.out.println("IVth Quadrant");
		} else {
			System.out.println("Origin");
		}

	}

}
