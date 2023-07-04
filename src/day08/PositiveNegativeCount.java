package day08;

import java.util.Scanner;

public class PositiveNegativeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int positive = 0;
	    int negative = 0;
	    
	    int i = 1;
	    while(i <= n){
	      int num = sc.nextInt();
	      if(num >= 0) {
	        positive++;
	      } else {
	        negative++;
	      }
	      i++;
	    }
	    System.out.println("Positive numbers: " + positive);
	    System.out.println("Negative numbers: "+negative);

	}

}
