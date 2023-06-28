package day04;

import java.util.Scanner;

public class BoatSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int boatWeight = sc.nextInt();
	    int adults = sc.nextInt();
	    int child = sc.nextInt();
	    
	    int weiAdult = adults*75;
	    int weiChild = child*30;
	    int totalwei = weiAdult + weiChild;
	    
	    if(boatWeight >= totalwei) {
	      System.out.println("Boat is stable");
	    } else {
	      System.out.println("Boat will sink");
	    }

	}

}
