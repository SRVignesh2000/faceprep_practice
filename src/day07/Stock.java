package day07;

import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int stock = sc.nextInt();
		int amount = sc.nextInt();
		int cus = sc.nextInt();

		if (stock < cus) {
			System.out.println("Out of stock");
		} else {
			int total = cus * amount;
			int remaining = stock - cus;
			System.out.println("The amount for " + cus + " " + name + " is" + total);
			System.out.println("Remaining number of " + name + "s precent in the stock: " + remaining);
		}

	}

}
