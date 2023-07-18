package day16;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner get =new Scanner(System.in);
	      String a = get.nextLine();
	      String b = get.nextLine();
	      a = a.trim();
	      b = b.trim();
	      System.out.println("Strings before swapping: " + a + " " + b);
	      System.out.println("Strings after swapping: " + b + " " + a);

	}

}
