package day03;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    int length = sc.nextInt();
	    int num2 = sc.nextInt();
	    
	    int peri = 2*(length+num2);
	    int area = length*num2;
	    
	    System.out.println(peri+"m");
	    System.out.println(area+"sqm");
	}

}
