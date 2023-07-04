package day07;

import java.util.Scanner;

public class PositiveCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int sum = 0;
	    int count = 0;
	    int i = 0;
	    while(i < n) {
	      int number = sc.nextInt();
	      if(number > 0) {
	        sum += number;
	        count++;
	      }
	      i++;
	    }
	    
	    System.out.println("Number of positive numbers entered is " + count + " and the sum is " + sum);

	}

}
