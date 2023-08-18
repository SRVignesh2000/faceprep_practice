package day24;

import java.util.Scanner;

public class Constructor2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		String name = sc.next();
		System.out.println("Id");
		int id = sc.nextInt();
		System.out.println("Department");
		String department = sc.next();
		System.out.println("Original:-");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department Id: " + id);
		System.out.println("Department:" + department);
		System.out.println("Duplicate:-");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department Id: " + id);
		System.out.println("Department:" + department);
	}
}
