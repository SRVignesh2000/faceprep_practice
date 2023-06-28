package day05;

import java.util.Scanner;

public class ArreasCGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		    String name = sc.next();
		    int registerNo = sc.nextInt();
		    float cGPA  = sc.nextFloat();
		    int arrears = sc.nextInt();
		    
		    System.out.println(name);
		     System.out.println(registerNo);
			
		    if(arrears == 0 && cGPA >= 7.0){
		      System.out.println("Eligible to attend placement");
		    } else if((arrears == 1 || arrears == 2) && cGPA >= 7.5){
		      System.out.println("Eligible to attend placement");
		    } else {
		      System.out.println("Not Eligible to attend placement");
		    }

	}

}
