package day26;

import java.util.Scanner;

public class BankAccount {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int acNo = sc.nextInt();
		String name = sc.next();
		String use = sc.next();
		int amount1 = sc.nextInt();
		int amount2 = sc.nextInt();
		int amount3 = sc.nextInt();

		System.out.println("Enter Details:");
		System.out.println("Account No:");
		System.out.println("Name:");
		System.out.println("Account Type:");
		System.out.println("Balance:");
		System.out.println("Enter Deposit Amount =");
		System.out.println("Enter Withdraw Amount =");

		System.out.println("Account No: " + acNo);
		System.out.println("Name: " + name);
		System.out.println("Account Type: " + use);
		int val = ((amount1 + amount2) - amount3);
		System.out.println("Balance: " + val);
	}

}
