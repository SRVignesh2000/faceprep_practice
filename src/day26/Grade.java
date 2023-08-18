package day26;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student's basic information:");
		System.out.println("Name: ");
		String name = input.nextLine();
		System.out.println("Age: ");
		int age = input.nextInt();
		input.nextLine(); // Consume the newline character left by nextInt()
		System.out.println("Gender: ");
		String gender = input.nextLine();
		System.out.println("\nEnter student's result information:");
		System.out.println("Total Marks: ");
		int totalMarks = input.nextInt();
		input.nextLine(); // Consume the newline character left by nextInt()
		System.out.println("Grade: ");
		char grade = input.nextLine().charAt(0);
		double percentage = (totalMarks / 500.0) * 100;
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Percentage: " + (int) percentage);
		System.out.println("Grade: " + grade);
	}

}
