package day05;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int year = sc.nextInt();
	    if(year%4 == 0){
	      System.out.println(year+" is a leap year");
	    } else {
	      System.out.println(year+" is not a leap year");
	    }

	}

}
