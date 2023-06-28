package day04;

import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number between 1 to 12");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10:
		case 12:
			System.out.println("31 Days");
			break;
			
		case 2 :
			System.out.println("28 or 29 Days");
			break;
			
		case 4 :
		case 6 :
		case 9 :
		case 11:
			System.out.println("30 Days");
			break;
			
		default :
			System.out.println("Invalid number");
			
		}
	}

}
