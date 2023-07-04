package day07;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    
	    int fromNum = sc.nextInt();
	    int lastNum = sc.nextInt();
	    
	    for(int i = fromNum; i <= lastNum; i++) {
	      
	      int lastDigit = i % 10;
	      int firstDigit = i / 10;
	      
	      int sum = firstDigit + lastDigit;
	      int product = firstDigit * lastDigit;
	      
	      if(sum + product == i) {
	        System.out.println(i);
	      } 
	    }    
	}

}
