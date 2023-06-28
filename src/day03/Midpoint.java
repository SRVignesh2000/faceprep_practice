package day03;

import java.util.Scanner;

public class Midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int x1 = sc.nextInt();
	    int y1 = sc.nextInt();
	    int x2 = sc.nextInt();
	    int y2 = sc.nextInt();
	    
	    // method 1
//	    double mid1 = (x1+x2)/2.0;
//	    double mid2 = (y1+y2)/2.0;
//	    
//	    System.out.printf("Binoy's house is located at (%.1f,%.1f)" , mid1 , mid2);
	    
	    // method 2
	    float mid1 =(float) (x1+x2)/2;
	    float mid2 =(float) (y1+y2)/2;
	    
	    System.out.println("Binoy's house is located at " + mid1 +","+ mid2);

	}

}
