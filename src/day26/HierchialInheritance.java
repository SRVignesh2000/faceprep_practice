package day26;

import java.util.Scanner;

public class HierchialInheritance {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		String color = input.next();
		float capacity = input.nextInt();
		int speed = input.nextInt();
		float price = input.nextInt();
		int dis = input.nextInt();
		float amount = price - dis;
		String name1 = input.next();
		String color1 = input.next();
		float capacity1 = input.nextInt();
		int speed1 = input.nextInt();
		float price1 = input.nextInt();
		int dis1 = input.nextInt();
		int weight = input.nextInt();
		float amount1 = price1 - dis1;
		System.out.println(
				"Enter the details of Sports Bike\nName of the bike :\nColor of the bike :\nCapacity(cc) of the bike :\nSpeed of the bike :\nPrice of the bike :\nDiscount of the bike :\nEnter the details of Scooter\nName of the Scooter\nColor of the Scooter :\nCapacity(CC) of the Scooter :\nSpeed of the Scooter :\nPrice of the Scooter :\nDiscount of the scooter :\nWeight of the scooter :");
		System.out.println("Sports Bike :\nName : " + name + "\nColor : " + color + "\nCapacity : " + capacity
				+ "\nSpeed : " + speed + "\nPrice : " + price + "\nManufacturer Discount : " + dis
				+ "\nSports Bike price is " + amount);
		System.out.println("Scooter :\nName : " + name1 + "\nColor : " + color1 + "\nCapacity : " + capacity1
				+ "\nSpeed : " + speed1 + "\nPrice : " + price1 + "\nWeight : " + weight + "\nManufacturer Discount : "
				+ dis1 + "\nScooter price is " + amount1);
	}

}
