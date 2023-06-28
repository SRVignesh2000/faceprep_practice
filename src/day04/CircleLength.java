package day04;

import java.util.Scanner;

public class CircleLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    int diameter = a*2;
	    
	    if(diameter <= b) {
	      System.out.println("circle can be inside a square");
	    } else {
	      System.out.println("circle cannot be inside a Square");
	    }

	}

}
