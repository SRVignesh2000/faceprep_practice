package day07;

import java.util.Scanner;

public class TimeSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[] hours = new int[7];

        // Read input values for each day
        for (int i = 0; i < 7; i++) {
            hours[i] = scanner.nextInt();
        }

        int baseRate = 100; // Base rate per hour
        int extraRate = 15; // Extra rate per hour for more than 8 hours
        int extraRate2 = 25; // Extra rate per hour for more than 40 hours
        int bonusSaturday = 25; // Bonus percentage for working on Saturday
        int bonusSunday = 50; // Bonus percentage for working on Sunday

        int totalHours = 0;
        int salary = 0;

        // Calculate salary for each day
        for (int i = 0; i < 7; i++) {
            totalHours += hours[i];
            int dailySalary = baseRate * hours[i]; // Base salary for the day

          	if (i == 0) { // Sunday
                double bonusPercentage = bonusSunday / 100.0;
                int bonusAmount = (int) (dailySalary * bonusPercentage); // Bonus for working on Sunday
                dailySalary += bonusAmount;
            } else if (i == 6) { // Saturday
                double bonusPercentage = bonusSaturday / 100.0;
                int bonusAmount = (int) (dailySalary * bonusPercentage); // Bonus for working on Saturday
                dailySalary += bonusAmount;
            } 
			if (hours[i] > 8) {
                int extraHours = hours[i] - 8;
                int extraSalary = extraRate * extraHours; // Extra salary for working more than 8 hours
                dailySalary += extraSalary;
            }
          //System.out.println(hours[i] + " "  +dailySalary);


            salary += dailySalary;
         //System.out.println(hours[i] + " "  +salary);
        }
      
      

        // Calculate bonus for working more than 40 hours in a week
        if (totalHours > 40) {
            int extraHours = totalHours - 40;
            int extraSalary = extraHours * 25;
            salary += extraSalary;
        }

        System.out.println(salary);

	}

}
