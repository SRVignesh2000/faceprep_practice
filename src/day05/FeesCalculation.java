package day05;

import java.util.Scanner;

public class FeesCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String studentType = sc.nextLine();
        double tuitionFee = sc.nextDouble();
        double busFee = sc.nextDouble();
        double hostelFee = sc.nextDouble();
        double totalFee;
        if (studentType.equals("MSDS")) {
            totalFee = tuitionFee + busFee;
        } else if (studentType.equals("MSH")) {
            totalFee = tuitionFee + hostelFee;
        } else if (studentType.equals("MGSDS")) {
            totalFee = 1.5 * tuitionFee + busFee;
        } else if (studentType.equals("MGSH")) {
            totalFee = 1.5 * tuitionFee + hostelFee;
        } else {
            System.out.println("Invalid");
            return;
        }
        System.out.printf("%.2f", totalFee);

	}

}
