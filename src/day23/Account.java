package day23;

import java.util.Scanner;

public class Account {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Details:");
		System.out.println("Account No. ");
		int accNo = sc.nextInt();
		System.out.println("Name : ");
		String name = sc.next();
		System.out.println("Account Type : ");
		String type = sc.next();
		System.out.println("Balance : ");
		int balance = sc.nextInt();
		System.out.println("Enter Deposit Amount = ");
		int deposit = sc.nextInt();
		System.out.println("Enter Withdraw Amount = ");
		int withdraw = sc.nextInt();

		int afterDep = balance + deposit;
		int afterWith = afterDep - withdraw;
		if (afterDep < withdraw) {
			System.out.println("Cannot Withdraw Amount");
		}

		System.out.println("Account No. : " + accNo);
		System.out.println("Name : " + name);
		System.out.println("Account Type : " + type);
		System.out.println("Balance : " + afterWith);

	}

}
