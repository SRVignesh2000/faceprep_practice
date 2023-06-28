package day03;

import java.util.Scanner;

public class CenterPointWith3digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int x1 = sc.nextInt();
	    int y1 = sc.nextInt();
	    int x2 = sc.nextInt();
	    int y2 = sc.nextInt();
	    int x3 = sc.nextInt();
	    int y3 = sc.nextInt();
	    
	    double x = (x1+x2+x3)/3.0;
	    double y = (y1+y2+y3)/3.0;
	    
	    System.out.printf("%.1f\n",x);
	    System.out.printf("%.1f",y);

	}

}
