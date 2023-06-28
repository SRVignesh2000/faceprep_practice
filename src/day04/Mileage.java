package day04;

import java.util.Scanner;

public class Mileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    float mileage = sc.nextFloat();
	    int petrol = sc.nextInt();
	    int distance = sc.nextInt();
	    
	    int check =(int) mileage * petrol;
	    if(check < distance) {
	      System.out.println("Cannot reach");
	    } else {
	      System.out.println("Can reach");
	    }

	}

}
