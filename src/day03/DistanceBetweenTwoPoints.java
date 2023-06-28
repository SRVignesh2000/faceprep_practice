package day03;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int x1 = sc.nextInt();
	    int y1 = sc.nextInt();
	    int x2 = sc.nextInt();
	    int y2 = sc.nextInt();
	    
	    double x = (x1+x2)/2.0;
	    double y = (y1+y2)/2.0;
	    
	    System.out.print("Binoy's house is located at "+ "("+ x +","+ y + ")");
		

	}

}
