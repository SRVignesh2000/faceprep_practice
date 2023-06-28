package day03;

import java.util.Scanner;

public class SimpleInterest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
	    int n = sc.nextInt();
	    float r = sc.nextFloat();
	    
	    double si = p * n * r / 100;
	    System.out.printf("%.2f",si);

	}

}
