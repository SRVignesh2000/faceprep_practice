package day08;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int originalNumber = num;
	    int sum = 0;
	    
	    while(originalNumber!=0) {
	      int digit = originalNumber % 10;
	      sum += Math.pow(digit,3); 
	      originalNumber/=10;
	    }
	   
	    if(sum == num) {
	      System.out.println(1);
	    } else {
	      System.out.println(0);
	    }
	}

}
