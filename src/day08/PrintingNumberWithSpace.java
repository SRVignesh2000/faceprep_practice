package day08;

import java.util.Scanner;

public class PrintingNumberWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    int first = num / 100000;
	    int second = (num / 10000) % 10;
	    int third = (num / 1000) % 10;
	    int fourth = (num / 100) % 10;
	    int fifth = (num / 10) % 10;
	    int sixth = num % 10;
	    System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth );

	}

}
