package day08;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    int i = a;
	    while (i>=b) {
	      System.out.println(i);
	      i--;
	    }

	}

}
