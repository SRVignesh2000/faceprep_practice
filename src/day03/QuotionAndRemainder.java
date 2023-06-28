package day03;

import java.util.Scanner;

public class QuotionAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int friends = sc.nextInt();
	    int teams = sc.nextInt();
	    
	    int personPerTeam = friends/teams;
	    int remainingPerson = friends%teams;
	    
	    System.out.println("The number of friends in each team is " + personPerTeam + " and left out is " + remainingPerson );

	}

}
