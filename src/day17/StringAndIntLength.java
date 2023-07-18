package day17;

import java.util.*;

public class StringAndIntLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int length = name.length();
		String a = name.replaceAll("[A-Za-z]", "");
		int aLength = a.length();

		System.out.println("The number of digits is:");
		System.out.println(aLength);
		System.out.println("The number of characters is:");
		System.out.println(length - aLength);
		

	}

}
