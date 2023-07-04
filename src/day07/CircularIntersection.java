package day07;

import java.util.Scanner;

public class CircularIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      int x1 = sc.nextInt();
	      int y1 = sc.nextInt();
	      int radius1 = sc.nextInt();
	      int x2 = sc.nextInt();
	      int y2 = sc.nextInt();
	      int radius2 = sc.nextInt();
	      
	      double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	      
	       if ((int)distance == radius1 + radius2) {
	            System.out.println("Tangential");
	        } else if ((int)distance < radius1 + radius2) {
	            System.out.println("Overlap");
	        } else {
	            System.out.println("Do not overlap");
	        }

	}

}
