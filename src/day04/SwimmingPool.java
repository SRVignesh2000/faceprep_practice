package day04;

import java.util.Scanner;

public class SwimmingPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int length = sc.nextInt();
	    int liter = sc.nextInt();
	    
	    int ans = length * length * length * 1000;
	    if(ans < liter) {
	      System.out.println("Cannot store");
	    } else {
	       System.out.println("Can store");
	    }

	}

}
