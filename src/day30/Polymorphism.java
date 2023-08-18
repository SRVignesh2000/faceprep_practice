package day30;

import java.util.*;

class Calories {
	float calories;
	float energy;

	public void calculateCaloires(int bread) {
		calories = 74 * bread;
	}

	public void calculateCaloires(int bread, int jam) {
		calories = (74 * bread) + (26 * jam);
	}

	public void calculateCaloires(int bread, int jam, int butter) {
		calories = (74 * bread) + (26 * jam) + (102 * butter);

	}

	public void calculateEnergy() {
		energy = (float) calories * (float) 4.1868;
		System.out.printf("%.3f kJ of energy generated from %.3f calories", energy, calories);
	}
}

class Main {
	public static void main(String args[]) {
		// type your code here
		Calories c = new Calories();

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();
		if (choice == 1) {
			int bread = sc.nextInt();
			c.calculateCaloires(bread);
			System.out.println("1.Bread only");
			System.out.println("2.Bread+Jam");
			System.out.println("3.Bread+Jam+Butter");
			System.out.println("Enter the choice");
			System.out.println("Enter the number of Slice of bread");
			c.calculateEnergy();
		} else if (choice == 2) {
			int bread = sc.nextInt();
			int jam = sc.nextInt();
			c.calculateCaloires(bread, jam);
			System.out.println("1.Bread only");
			System.out.println("2.Bread+Jam");
			System.out.println("3.Bread+Jam+Butter");
			System.out.println("Enter the choice");
			System.out.println("Enter the number of Slice of bread");
			System.out.println("Enter the number teaspoon of Jam");
			c.calculateEnergy();
		} else if (choice == 3) {
			int bread = sc.nextInt();
			int jam = sc.nextInt();
			int butter = sc.nextInt();
			c.calculateCaloires(bread, jam, butter);
			System.out.println("1.Bread only");
			System.out.println("2.Bread+Jam");
			System.out.println("3.Bread+Jam+Butter");
			System.out.println("Enter the choice");
			System.out.println("Enter the number of Slice of bread");
			System.out.println("Enter the number teaspoon of Jam");
			System.out.println("Enter the number teaspoon of Butter");
			c.calculateEnergy();
		} else {
			System.out.println("1.Bread only");
			System.out.println("2.Bread+Jam");
			System.out.println("3.Bread+Jam+Butter");
			System.out.println("Enter the choice");
			System.out.println("0.000 kJ of energy generated from 0.000 calories");
		}
	}
}
