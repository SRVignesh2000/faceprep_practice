package day05;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dozen = 12;
		int totalCP = sc.nextInt();// 60
		int sp = sc.nextInt();// 4
		double totalSP = dozen * sp; // 12 * 4 = 48
		if (totalSP > totalCP) {
			double profit = totalSP - totalCP;
			System.out.printf("Profit : Rs." + (int) profit);
		} else if (totalCP > totalSP) {
			double loss = totalCP - totalSP;
			System.out.printf("Loss : Rs." + (int) loss);
		} else {
			System.out.println("No profit nor loss");
		}

	}

}
