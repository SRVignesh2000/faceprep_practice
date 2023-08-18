package day22;

import java.util.Scanner;

public class HoursFinderUsingSpedd {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int totalSpeed = x + y;
	    double hrs =(double) 200 / totalSpeed;
	    
	    System.out.println(hrs);

	}

}
