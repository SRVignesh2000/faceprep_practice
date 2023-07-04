package day06;

import java.util.Scanner;

public class DoorAndRail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String door = sc.nextLine();
		int rail = sc.nextInt();
		if (door.equals("front") && rail == 1) {
			System.out.println("Left Handed");
		} else if (door.equals("front") && rail == 2) {
			System.out.println("Right Handed");
		} else if (door.equals("front") && rail == 0) {
			System.out.println("Right Handed");
		} else if (door.equals("rear") && rail == 1) {
			System.out.println("Right Handed");
		} else if (door.equals("rear") && rail == 0) {
			System.out.println("Left Handed");
		} else if (door.equals("rear") && rail == 2) {
			System.out.println("Left Handed");
		}

	}

}
