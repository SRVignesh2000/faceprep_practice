package day07;

import java.util.Scanner;

public class TreasureFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int box1 = scanner.nextInt();
        int box2 = scanner.nextInt();
        int box3 = scanner.nextInt();

        // Find the largest number that divides all three numbers
        int largestDivisor = 1;
        for (int i = 1; i <= box1 && i <= box2 && i <= box3; i++) {
            if (box1 % i == 0 && box2 % i == 0 && box3 % i == 0) {
                largestDivisor = i;
            }
        }

        // Find the second largest number
        int secondLargest = Math.max(Math.min(box1, box2), Math.min(Math.max(box1, box2), box3));

        System.out.println("The treasure is in the box which has number " + secondLargest + ".");
        System.out.println("The code to open the box is " + largestDivisor + ".");

	}

}
